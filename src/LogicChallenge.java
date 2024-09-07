// Desafio 5: Como descobrir qual interruptor controla cada lâmpada, usando apenas duas idas até a sala?

/*
Solução:

1. Ligue o primeiro interruptor e deixe-o ligado por alguns minutos.
2. Depois, desligue o primeiro interruptor e ligue o segundo interruptor.
3. Vá até a sala das lâmpadas:
   - A lâmpada que estiver acesa está conectada ao segundo interruptor (porque foi o último a ser ligado).
   - A lâmpada que estiver apagada, mas estiver quente, está conectada ao primeiro interruptor (porque estava ligada antes, mas foi desligada).
   - A lâmpada que estiver apagada e fria está conectada ao terceiro interruptor (porque não foi ligada em nenhum momento).

Com esse processo, é possível determinar qual interruptor controla qual lâmpada.
*/