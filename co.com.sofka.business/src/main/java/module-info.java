module co.com.sofka.business {
    exports co.com.sofka.business.asyn;
    exports co.com.sofka.business.generic;
    exports co.com.sofka.business.support;
    exports co.com.sofka.business.annotation;
    exports co.com.sofka.business.repository;
    exports co.com.sofka.business.sync;
    requires co.com.sofka.domain;
    requires java.logging;
}