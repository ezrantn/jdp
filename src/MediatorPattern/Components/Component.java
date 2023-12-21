package MediatorPattern.Components;

import MediatorPattern.Mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
