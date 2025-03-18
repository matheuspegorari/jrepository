package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Pesquisa extends AbstractSankhyaEntity<Pesquisa> {
   private BigDecimal codQuest;
   private BigDecimal codUsu;
   private BigDecimal codUsuPesq;
   private Timestamp dhAlter;
   private Timestamp dtAplicacao;
   private BigDecimal horaAplicacao;
   private String nomePesq;
   private BigDecimal notaFinal;
   private BigDecimal nuCurriculoPesq;
   private BigDecimal nuPesq;
   private BigDecimal nuPla;
   private String observacao;
   private String tipoPesq;
   private BigDecimal codProdPesq;
   private BigDecimal codContatoPesq;
   private BigDecimal codEmpFunPesq;
   private BigDecimal codFuncPesq;
   private BigDecimal codPapPesq;
   private BigDecimal codParcPesq;

   public BigDecimal getCodQuest() {
        return codQuest;
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
        this.codQuest = codQuest;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuPesq() {
        return codUsuPesq;
   }

   public void setCodUsuPesq(BigDecimal codUsuPesq) {
        markAsChanged("CODUSUPESQ", codUsuPesq);
        this.codUsuPesq = codUsuPesq;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtAplicacao() {
        return dtAplicacao;
   }

   public void setDtAplicacao(Timestamp dtAplicacao) {
        markAsChanged("DTAPLICACAO", dtAplicacao);
        this.dtAplicacao = dtAplicacao;
   }

   public BigDecimal getHoraAplicacao() {
        return horaAplicacao;
   }

   public void setHoraAplicacao(BigDecimal horaAplicacao) {
        markAsChanged("HORAAPLICACAO", horaAplicacao);
        this.horaAplicacao = horaAplicacao;
   }

   public String getNomePesq() {
        return nomePesq;
   }

   public void setNomePesq(String nomePesq) {
        markAsChanged("NOMEPESQ", nomePesq);
        this.nomePesq = nomePesq;
   }

   public BigDecimal getNotaFinal() {
        return notaFinal;
   }

   public void setNotaFinal(BigDecimal notaFinal) {
        markAsChanged("NOTAFINAL", notaFinal);
        this.notaFinal = notaFinal;
   }

   public BigDecimal getNuCurriculoPesq() {
        return nuCurriculoPesq;
   }

   public void setNuCurriculoPesq(BigDecimal nuCurriculoPesq) {
        markAsChanged("NUCURRICULOPESQ", nuCurriculoPesq);
        this.nuCurriculoPesq = nuCurriculoPesq;
   }

   public BigDecimal getNuPesq() {
        return nuPesq;
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
        this.nuPesq = nuPesq;
   }

   public BigDecimal getNuPla() {
        return nuPla;
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
        this.nuPla = nuPla;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getTipoPesq() {
        return tipoPesq;
   }

   public void setTipoPesq(String tipoPesq) {
        markAsChanged("TIPOPESQ", tipoPesq);
        this.tipoPesq = tipoPesq;
   }

   public BigDecimal getCodProdPesq() {
        return codProdPesq;
   }

   public void setCodProdPesq(BigDecimal codProdPesq) {
        markAsChanged("CODPRODPESQ", codProdPesq);
        this.codProdPesq = codProdPesq;
   }

   public BigDecimal getCodContatoPesq() {
        return codContatoPesq;
   }

   public void setCodContatoPesq(BigDecimal codContatoPesq) {
        markAsChanged("CODCONTATOPESQ", codContatoPesq);
        this.codContatoPesq = codContatoPesq;
   }

   public BigDecimal getCodEmpFunPesq() {
        return codEmpFunPesq;
   }

   public void setCodEmpFunPesq(BigDecimal codEmpFunPesq) {
        markAsChanged("CODEMPFUNPESQ", codEmpFunPesq);
        this.codEmpFunPesq = codEmpFunPesq;
   }

   public BigDecimal getCodFuncPesq() {
        return codFuncPesq;
   }

   public void setCodFuncPesq(BigDecimal codFuncPesq) {
        markAsChanged("CODFUNCPESQ", codFuncPesq);
        this.codFuncPesq = codFuncPesq;
   }

   public BigDecimal getCodPapPesq() {
        return codPapPesq;
   }

   public void setCodPapPesq(BigDecimal codPapPesq) {
        markAsChanged("CODPAPPESQ", codPapPesq);
        this.codPapPesq = codPapPesq;
   }

   public BigDecimal getCodParcPesq() {
        return codParcPesq;
   }

   public void setCodParcPesq(BigDecimal codParcPesq) {
        markAsChanged("CODPARCPESQ", codParcPesq);
        this.codParcPesq = codParcPesq;
   }

   @Override
   public String getTableName() {
        return "TPQPES";
   }

   @Override
   public String getEntityName() {
        return "Pesquisa";
   }

   @Override
   public Pesquisa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuPesq = vo.asBigDecimal("CODUSUPESQ");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtAplicacao = vo.asTimestamp("DTAPLICACAO");
        this.horaAplicacao = vo.asBigDecimal("HORAAPLICACAO");
        this.nomePesq = vo.asString("NOMEPESQ");
        this.notaFinal = vo.asBigDecimal("NOTAFINAL");
        this.nuCurriculoPesq = vo.asBigDecimal("NUCURRICULOPESQ");
        this.nuPesq = vo.asBigDecimal("NUPESQ");
        this.nuPla = vo.asBigDecimal("NUPLA");
        this.observacao = vo.asString("OBSERVACAO");
        this.tipoPesq = vo.asString("TIPOPESQ");
        this.codProdPesq = vo.asBigDecimal("CODPRODPESQ");
        this.codContatoPesq = vo.asBigDecimal("CODCONTATOPESQ");
        this.codEmpFunPesq = vo.asBigDecimal("CODEMPFUNPESQ");
        this.codFuncPesq = vo.asBigDecimal("CODFUNCPESQ");
        this.codPapPesq = vo.asBigDecimal("CODPAPPESQ");
        this.codParcPesq = vo.asBigDecimal("CODPARCPESQ");
        return this;
   }
}
