package ExemploUso;

import Action.AcaoVirtual;
import Panel.MyscreenPanel;
import java.awt.Graphics;

/**
 *
 * @author JB
 */
//Na classe 'AcaoExibirNome' como queremos que seja um objeto de ação virtual, então extendemos da classe 'AcaoVirtual'.  
public class AcaoExibirNome extends AcaoVirtual {

    //Método 'execute' é o método de ação, qualquer ação para ser feita no proprio computador, em java mesmo, como parametro é passado 'MyscreenPanel'
    //que é do tipo 'ScreenPanel', com objetivo de facilitar a alteração de algum shape no painel, com um método 'substituirShape'.
    @Override
    public void run(MyscreenPanel sp) {
        //Vamos colocar como exemplo exibir 'JB'
        System.out.println("aumentando");
        
    }
    public void paint(Graphics g){
        g.drawLine(19, 455, 64, 500);
    }
}
