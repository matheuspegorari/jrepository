package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RespostaPerguntaPesquisa extends AbstractSankhyaEntity<RespostaPerguntaPesquisa> {
   private byte[] anexo;
   private BigDecimal codPerg;
   private BigDecimal codResp;
   private BigDecimal codUsu;
   private BigDecimal codUsuCorretor;
   private Timestamp dhAlter;
   private Timestamp dhCorrecao;
   private BigDecimal nota;
   private BigDecimal nuPesq;
   private String observacao;
   private String texto;
   private BigDecimal valor;
   private String proibElimepza;

   public byte[] getAnexo() {
        return anexo;
   }

   public void setAnexo(byte[] anexo) {
        markAsChanged("ANEXO", anexo);
        this.anexo = anexo;
   }

   public BigDecimal getCodPerg() {
        return codPerg;
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
        this.codPerg = codPerg;
   }

   public BigDecimal getCodResp() {
        return codResp;
   }

   public void setCodResp(BigDecimal codResp) {
        markAsChanged("CODRESP", codResp);
        this.codResp = codResp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuCorretor() {
        return codUsuCorretor;
   }

   public void setCodUsuCorretor(BigDecimal codUsuCorretor) {
        markAsChanged("CODUSUCORRETOR", codUsuCorretor);
        this.codUsuCorretor = codUsuCorretor;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCorrecao() {
        return dhCorrecao;
   }

   public void setDhCorrecao(Timestamp dhCorrecao) {
        markAsChanged("DHCORRECAO", dhCorrecao);
        this.dhCorrecao = dhCorrecao;
   }

   public BigDecimal getNota() {
        return nota;
   }

   public void setNota(BigDecimal nota) {
        markAsChanged("NOTA", nota);
        this.nota = nota;
   }

   public BigDecimal getNuPesq() {
        return nuPesq;
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
        this.nuPesq = nuPesq;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
        this.texto = texto;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public String getProibElimepza() {
        return proibElimepza;
   }

   public void setProibElimepza(String proibElimepza) {
        markAsChanged("PROIBELIMPEZA", proibElimepza);
        this.proibElimepza = proibElimepza;
   }

   @Override
   public String getTableName() {
        return "TPQRPE";
   }

   @Override
   public String getEntityName() {
        return "RespostaPerguntaPesquisa";
   }

   @Override
   public RespostaPerguntaPesquisa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.anexo = vo.asBlob("ANEXO");
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.codResp = vo.asBigDecimal("CODRESP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuCorretor = vo.asBigDecimal("CODUSUCORRETOR");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCorrecao = vo.asTimestamp("DHCORRECAO");
        this.nota = vo.asBigDecimal("NOTA");
        this.nuPesq = vo.asBigDecimal("NUPESQ");
        this.observacao = vo.asString("OBSERVACAO");
        this.texto = vo.asString("TEXTO");
        this.valor = vo.asBigDecimal("VALOR");
        this.proibElimepza = vo.asString("PROIBELIMPEZA");
        return this;
   }
}
