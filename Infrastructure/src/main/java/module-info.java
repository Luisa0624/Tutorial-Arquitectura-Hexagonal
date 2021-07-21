module hr.dstr89.hexagone.infrastructure {
    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires org.example.hexagone.application;
    requires org.example.hexagone.domain;

    exports example.org.hexagonal.infrastructure;
    exports org.example.hexagone.infrastructure;
}