package Model;

import java.util.Collection;
import java.util.List;

public class Multiply implements ICalculus{

    public Multiply() {
    }

    public Multiply(Integer numb1, Integer numb2) {
        this._numb1 = numb1;
        this._numb2 = numb2;
    }

    public Multiply(List<Integer> operands) {
        _operands = operands;
    }

    @Override
    public Object perform(Integer i, Integer j) {
        return null;
    }

    @Override
    public Object perform(Collection<?> c) {
        return null;
    }

    public Integer getNumb2() { return _numb2;    }

    public void setNumb2(Integer numb2) { this._numb2 = numb2;    }
    public Integer getNumb1() { return _numb1;   }

    public void setNumb1(Integer numb1) {
        this._numb1 = numb1;
    }

    public List<Integer> getOperands() { return _operands;    }
    public void setOperands(List<Integer> operands) { this._operands = operands;    }

    private Integer _numb2;
    private Integer _numb1;
    private List<Integer> _operands;

}
