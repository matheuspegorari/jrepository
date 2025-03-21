package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnuncioVagas extends AbstractSankhyaEntity<AnuncioVagas> {
   private String tipo;
   private String resumo;
   private String descrVaga;
   private BigDecimal codAnuncio;
   private BigDecimal nuRequisicao;
   private String status;
   private BigDecimal faixaSalarialFinal;
   private Timestamp dtEntrada;
   private BigDecimal faixaSalarialInicial;
   private BigDecimal grauInstr;
   private BigDecimal nuVagas;
   private Timestamp dtTermino;

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getResumo() {
        return resumo;
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
        this.resumo = resumo;
   }

   public String getDescrVaga() {
        return descrVaga;
   }

   public void setDescrVaga(String descrVaga) {
        markAsChanged("DESCRVAGA", descrVaga);
        this.descrVaga = descrVaga;
   }

   public BigDecimal getCodAnuncio() {
        return codAnuncio;
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        markAsChanged("CODANUNCIO", codAnuncio);
        this.codAnuncio = codAnuncio;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
        this.nuRequisicao = nuRequisicao;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getFaixaSalarialFinal() {
        return faixaSalarialFinal;
   }

   public void setFaixaSalarialFinal(BigDecimal faixaSalarialFinal) {
        markAsChanged("FAIXASALARIALFINAL", faixaSalarialFinal);
        this.faixaSalarialFinal = faixaSalarialFinal;
   }

   public Timestamp getDtEntrada() {
        return dtEntrada;
   }

   public void setDtEntrada(Timestamp dtEntrada) {
        markAsChanged("DTENTRADA", dtEntrada);
        this.dtEntrada = dtEntrada;
   }

   public BigDecimal getFaixaSalarialInicial() {
        return faixaSalarialInicial;
   }

   public void setFaixaSalarialInicial(BigDecimal faixaSalarialInicial) {
        markAsChanged("FAIXASALARIALINICIAL", faixaSalarialInicial);
        this.faixaSalarialInicial = faixaSalarialInicial;
   }

   public BigDecimal getGrauInstr() {
        return grauInstr;
   }

   public void setGrauInstr(BigDecimal grauInstr) {
        markAsChanged("GRAUINSTR", grauInstr);
        this.grauInstr = grauInstr;
   }

   public BigDecimal getNuVagas() {
        return nuVagas;
   }

   public void setNuVagas(BigDecimal nuVagas) {
        markAsChanged("NUVAGAS", nuVagas);
        this.nuVagas = nuVagas;
   }

   public Timestamp getDtTermino() {
        return dtTermino;
   }

   public void setDtTermino(Timestamp dtTermino) {
        markAsChanged("DTTERMINO", dtTermino);
        this.dtTermino = dtTermino;
   }

   @Override
   public String getTableName() {
        return "TRSANU";
   }

   @Override
   public String getEntityName() {
        return "AnuncioVagas";
   }

   @Override
   public AnuncioVagas fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.tipo = vo.asString("TIPO");
        this.resumo = vo.asString("RESUMO");
        this.descrVaga = vo.asString("DESCRVAGA");
        this.codAnuncio = vo.asBigDecimal("CODANUNCIO");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.status = vo.asString("STATUS");
        this.faixaSalarialFinal = vo.asBigDecimal("FAIXASALARIALFINAL");
        this.dtEntrada = vo.asTimestamp("DTENTRADA");
        this.faixaSalarialInicial = vo.asBigDecimal("FAIXASALARIALINICIAL");
        this.grauInstr = vo.asBigDecimal("GRAUINSTR");
        this.nuVagas = vo.asBigDecimal("NUVAGAS");
        this.dtTermino = vo.asTimestamp("DTTERMINO");
        return this;
   }
}
