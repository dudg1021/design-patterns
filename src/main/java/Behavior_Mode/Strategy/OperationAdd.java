package Behavior_Mode.Strategy;

/**
 * @class: OperationAdd
 * @description:
 * @author: dudg
 * @create: 2022-07-15 18:36
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
