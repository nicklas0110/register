package be;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Complaint {
    private LocalDate dato;
    private SimpleStringProperty title, details;

    public Complaint(LocalDate dato, String title, String details) {
        this.dato = dato;
        this.title = new SimpleStringProperty(title);
        this.details = new SimpleStringProperty(details);
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getDetails() {
        return details.get();
    }

    public SimpleStringProperty detailsProperty() {
        return details;
    }

    public void setDetails(String details) {
        this.details.set(details);
    }
}
