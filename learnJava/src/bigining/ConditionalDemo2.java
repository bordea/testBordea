package bigining;

// see Ternary IfElse & ConditionalDemo

class ConditionalDemo2 {
    public static void main(String[] args){
        int value1 = 1, value2 = 2, result;
        boolean someCondition = false;

        result = someCondition ? value1 : value2;       // result = value1 daca somecondition == True
                                                        // result = value2 daca somecondition == False
        System.out.println(result);
    }
}
