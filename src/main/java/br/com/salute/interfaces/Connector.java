package br.com.salute.interfaces;

import br.com.salute.dto.IsbnDTO;

public interface Connector {

    public IsbnDTO recuperarIsbn(String codigoIsbn);
}
