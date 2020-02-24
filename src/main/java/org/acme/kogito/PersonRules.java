package org.acme.kogito;

import org.acme.kogito.model.Person;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

public class PersonRules implements RuleUnitData {
    private final DataStore<Person> person = DataSource.createStore();

    public DataStore<Person> getPerson() {
        return person;
    }

}