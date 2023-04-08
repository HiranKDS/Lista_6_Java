public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Tenis", 10.5);

        if (produto.isCaro()) {
            System.out.println("O produto " + produto.getNome() + " é caro.");
        } 
        
        else {
            System.out.println("O produto " + produto.getNome() + " não é caro.");
        }
        Livro livro = new Livro(158, "Gabriel Garcia");
        
        if (livro.isExtenso()) {
                System.out.println("O livro é extenso, tem " + livro.getPaginas() + " páginas.");
        } 
        
        else {
                System.out.println("O livro não é extenso, tem " + livro.getPaginas() + " páginas.");
        }
    }
}
