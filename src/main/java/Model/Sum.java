package Model;

import java.util.*;

import static java.lang.Math.*;

public class Sum implements ICalculus{
    public Sum() {
    }
    public Sum(Integer numb1, Integer numb2) {
        this._numb1 = numb1;
        this._numb2 = numb2;
    }

    public Sum(List<Integer> operands) { this._operands = operands;    }

    public Integer getNumb1() { return _numb1;    }
    public void setNumb1(Integer numb1) { this._numb1 = numb1;    }

    public void setNumb2(Integer numb2) { this._numb2 = numb2; }
    public Integer getNumb2() { return _numb2;    }

    public void setOperands(List<Integer> operands) { this._operands = operands;    }
    public List<Integer> get_operands() { return _operands;    }

    public void setResult(Integer result) { this._result = result; }
    public Integer getResult() { return _result; }

    private Integer _numb1, _numb2;
    private Integer _result;
    private List<Integer> _operands;

    @Override
    public Integer perform(Integer i, Integer j) {
        _numb1=i;
        _numb2=j;
        return _result = addExact(_numb1, _numb2);
    }

    @Override
    public Integer perform(Collection<?> c) {
        c.forEach((item) -> {_result += addExact(_result, (Integer) item); });
        return _result;
    }
}
