import javax.swing.JOptionPane;
class compara_nomes
{
    public static void main(String args[])
    {

        String login, senha, nome1, nome2, resultado1, resultado2;

        login = JOptionPane.showInputDialog("Digite o seu login: ");
        nome1 = new String("suzana@gmail.com");
        resultado1 =(login.equals(nome1))? "Correto":"Errado";

        if(resultado1 == "Correto")
        {
            JOptionPane.showMessageDialog(null, "Seu login está: "+resultado1);
            senha = JOptionPane.showInputDialog("Digite sua senha");
            nome2 = new String("123asd@");
            resultado2 =(senha.equals(nome2))? "Correta":"Errada";

            if(resultado2 == "Correto")
            {
                JOptionPane.showMessageDialog(null, "Sua senha está: "+resultado2);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sua senha está: "+resultado2);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Seu login está: "+resultado1);
        }
    }
}