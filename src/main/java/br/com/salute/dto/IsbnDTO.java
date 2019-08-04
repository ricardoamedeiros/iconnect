package br.com.salute.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Calendar;

@XmlRootElement
public class IsbnDTO {
    private String codigoIsbn;
    private String titulo;
    private Integer ano;
    private Integer paginas;
    private String tiragem;
    private Boolean reedicao;
    private Boolean reempressao;
    private String meioDivulgacao;
    private String url;
    private String idioma;
    private String pais;
    private String naturezaObra;
    private String naturezaConteudo;
    private String tipoContribuicao;

    public String getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(String codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getTiragem() {
        return tiragem;
    }

    public void setTiragem(String tiragem) {
        this.tiragem = tiragem;
    }

    public Boolean getReedicao() {
        return reedicao;
    }

    public void setReedicao(Boolean reedicao) {
        this.reedicao = reedicao;
    }

    public Boolean getReempressao() {
        return reempressao;
    }

    public void setReempressao(Boolean reempressao) {
        this.reempressao = reempressao;
    }

    public String getMeioDivulgacao() {
        return meioDivulgacao;
    }

    public void setMeioDivulgacao(String meioDivulgacao) {
        this.meioDivulgacao = meioDivulgacao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNaturezaObra() {
        return naturezaObra;
    }

    public void setNaturezaObra(String naturezaObra) {
        this.naturezaObra = naturezaObra;
    }

    public String getNaturezaConteudo() {
        return naturezaConteudo;
    }

    public void setNaturezaConteudo(String naturezaConteudo) {
        this.naturezaConteudo = naturezaConteudo;
    }

    public String getTipoContribuicao() {
        return tipoContribuicao;
    }

    public void setTipoContribuicao(String tipoContribuicao) {
        this.tipoContribuicao = tipoContribuicao;
    }

    public Integer getPaginasContribuicaoObra() {
        return paginasContribuicaoObra;
    }

    public void setPaginasContribuicaoObra(Integer paginasContribuicaoObra) {
        this.paginasContribuicaoObra = paginasContribuicaoObra;
    }

    public String getTipoEditora() {
        return tipoEditora;
    }

    public void setTipoEditora(String tipoEditora) {
        this.tipoEditora = tipoEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getFinanciamento() {
        return financiamento;
    }

    public void setFinanciamento(String financiamento) {
        this.financiamento = financiamento;
    }

    public String getNomeFinanciador() {
        return nomeFinanciador;
    }

    public void setNomeFinanciador(String nomeFinanciador) {
        this.nomeFinanciador = nomeFinanciador;
    }

    public String getConselhoEditorial() {
        return conselhoEditorial;
    }

    public void setConselhoEditorial(String conselhoEditorial) {
        this.conselhoEditorial = conselhoEditorial;
    }

    public String getDistribuicaoAcesso() {
        return distribuicaoAcesso;
    }

    public void setDistribuicaoAcesso(String distribuicaoAcesso) {
        this.distribuicaoAcesso = distribuicaoAcesso;
    }

    public Boolean getInformacaoAutores() {
        return informacaoAutores;
    }

    public void setInformacaoAutores(Boolean informacaoAutores) {
        this.informacaoAutores = informacaoAutores;
    }

    public Boolean getRevisaoPorPartes() {
        return revisaoPorPartes;
    }

    public void setRevisaoPorPartes(Boolean revisaoPorPartes) {
        this.revisaoPorPartes = revisaoPorPartes;
    }

    public String getIndiceRemessivo() {
        return indiceRemessivo;
    }

    public void setIndiceRemessivo(String indiceRemessivo) {
        this.indiceRemessivo = indiceRemessivo;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }

    public String getInstituicaoPremiacao() {
        return instituicaoPremiacao;
    }

    public void setInstituicaoPremiacao(String instituicaoPremiacao) {
        this.instituicaoPremiacao = instituicaoPremiacao;
    }

    public Calendar getDataPremiacao() {
        return dataPremiacao;
    }

    public void setDataPremiacao(Calendar dataPremiacao) {
        this.dataPremiacao = dataPremiacao;
    }

    public String getIndicacaoObraReferencia() {
        return indicacaoObraReferencia;
    }

    public void setIndicacaoObraReferencia(String indicacaoObraReferencia) {
        this.indicacaoObraReferencia = indicacaoObraReferencia;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public Calendar getDataIndicacao() {
        return dataIndicacao;
    }

    public void setDataIndicacao(Calendar dataIndicacao) {
        this.dataIndicacao = dataIndicacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCidadeEditora() {
        return cidadeEditora;
    }

    public void setCidadeEditora(String cidadeEditora) {
        this.cidadeEditora = cidadeEditora;
    }

    private Integer paginasContribuicaoObra;
    private String tipoEditora;
    private String nomeEditora;
    private String financiamento;
    private String nomeFinanciador;
    private String conselhoEditorial;
    private String distribuicaoAcesso;
    private Boolean informacaoAutores;
    private Boolean revisaoPorPartes;
    private String indiceRemessivo;
    private String premiacao;
    private String instituicaoPremiacao;
    private Calendar dataPremiacao;
    private String indicacaoObraReferencia;
    private String nomeInstituicao;
    private Calendar dataIndicacao;
    private String observacao;
    private String cidadeEditora;

}
