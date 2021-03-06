package Gestures.Using.ExemploUso;

import TTAirManagers.Action.ActionReal;
import TTAirManagers.Arduino.PortControl;
import TTAirManagers.Panel.MyscreenPanel;

/**
 *
 * @author JB
 */
//Classe de Ação, para trabalhar com ações no mundo real, ou seja, enviando string pela porta usb para que o arduino execute alguma ação. Para isso a classe 'AcaoEnviarArduino' deve extender da classe 'AcaoReal'
public class AcaoArduino extends ActionReal {

    //O Método 'runArduino' é o método em que se registra a ação usando o parâmetro 'cp' de 'ControlePorta' vc pode invocar o método 'enviaDados' e passa como parâmetro um valor tipo char.
    //Também como parâmetro um MyscreenPanel para facilitar alterações no painel.
    @Override
    public void runArduino(PortControl cp, MyscreenPanel sp) {
        //Enviar o numero 1 como char usando o método da classe PortControl
        cp.sendDate('1');
    }

    //Método stopAction é o método que pode ser usado para parar uma ação lançada anteriormente, por exemplo, Acender uma lâmpada é cadastrado um gesto, caso esse gesto seja feito duas vezes,
    //a segunda vez será chamado esse método que será para apagar a lâmpada. Para que essa situação seja possível é necessário passara true no método local ActionDouble().
    
    @Override
    public void stopAction(PortControl cp, MyscreenPanel sp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
