package by.it.akhmelev.calc_v3;

interface Operation {

    Var add(Var other);

    Var sub(Var other);

    Var mul(Var other);

    Var div(Var other);
}