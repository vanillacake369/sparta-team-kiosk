package main.kiosk.controller;

import main.domain.cart.Cart;
import main.domain.menu.Menu;
import main.domain.menu.service.ClientMenuService;
import main.domain.menu.view.ClientMenuView;
import main.domain.product.Product;
import main.kiosk.MenuBoard;
import main.kiosk.dto.ClientDto;
import main.kiosk.dto.ClientDtoMapper;
import main.kiosk.dto.ClientDtoValidator;
import main.utils.ConsoleInput;

public class ClientKioskController {
    // 메뉴판 인스턴스
    private static final MenuBoard menuBoard = MenuBoard.getInstance();

    private static final ClientMenuService clientMenuService = new ClientMenuService();
    private static final Cart cart = Cart.getInstance();

    public void runProgram() throws Exception {
        // 메뉴
        ClientMenuView.printAllMenus(menuBoard);

        // 메뉴 선택
        Menu menu = selectMenu();

        // 해당 메뉴에 대한 상품 선택
        Product product = selectProduct(menu);

        // 장바구니에 담기
        addCart(cart, product);
    }

    private Menu selectMenu() {
        int menuId = getInput();
        Menu menu = clientMenuService.findMenuById(menuBoard, menuId);
        ClientMenuView.printProductsOf(menu);
        return menu;
    }

    private Product selectProduct(Menu menu) {
        int productId = getInput();
        Product product = clientMenuService.findProductById(menu, productId);
        ClientMenuView.askAddCart(product, cart);
        return product;
    }

    private void addCart(Cart cart, Product product) {
        int addCartOption = getInput();
        if (addCartOption == 1) {
            cart.addProduct(product);
            ClientMenuView.doneAddCart();
        } else {
            ClientMenuView.abortAddCart();
        }
    }

    private int getInput() throws IllegalArgumentException {
        ClientDto clientDto = new ClientDto(ConsoleInput.readNextLine());
        ClientDtoValidator.validateDto(clientDto);
        return ClientDtoMapper.mapClientDto(clientDto);
    }
}
