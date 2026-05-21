package org.example.classes;

import java.time.LocalDate;

public class EventoCobertura {

    private LocalDate data;
    private TipoCobertura tipo;
    private Beneficiario solicitante;

    public EventoCobertura(LocalDate data, TipoCobertura tipo, Beneficiario solicitante) {

        this.data = data;
        this.tipo = tipo;
        this.solicitante = solicitante;

        if (tipo == TipoCobertura.INTERNACAO
                && !solicitante.podeSolicitarInternacao()) {

            throw new IllegalArgumentException(
                    "Beneficiário não possui cobertura de internação");
        }
    }

    public LocalDate getData() {
        return data;
    }

    public TipoCobertura getTipo() {
        return tipo;
    }

    public Beneficiario getSolicitante() {
        return solicitante;
    }
}
