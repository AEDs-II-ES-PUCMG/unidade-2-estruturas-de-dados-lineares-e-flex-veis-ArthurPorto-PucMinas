import java.util.function.Predicate;

public class CondicaoFiltrarPedido implements Predicate<Pedido> {

    private final Produto produtoBuscado;

    public CondicaoFiltrarPedido(Produto produtoBuscado) {
        this.produtoBuscado = produtoBuscado;
    }

    @Override
    public boolean test(Pedido pedido) {
        ItemDePedido itemBuscado = new ItemDePedido(produtoBuscado, 0, 0.0);

        return pedido.getItensDoPedido().buscarPor(new CriterioDeBuscaPorDescricao(), itemBuscado) != null;
    }
}
