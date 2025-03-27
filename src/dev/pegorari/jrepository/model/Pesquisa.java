package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Pesquisa extends AbstractSankhyaEntity<Pesquisa> {
   public BigDecimal getCodQuest() {
        return this.getVo().asBigDecimal("CODQUEST");
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuPesq() {
        return this.getVo().asBigDecimal("CODUSUPESQ");
   }

   public void setCodUsuPesq(BigDecimal codUsuPesq) {
        markAsChanged("CODUSUPESQ", codUsuPesq);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDtAplicacao() {
        return this.getVo().asTimestamp("DTAPLICACAO");
   }

   public void setDtAplicacao(Timestamp dtAplicacao) {
        markAsChanged("DTAPLICACAO", dtAplicacao);
   }

   public BigDecimal getHoraAplicacao() {
        return this.getVo().asBigDecimal("HORAAPLICACAO");
   }

   public void setHoraAplicacao(BigDecimal horaAplicacao) {
        markAsChanged("HORAAPLICACAO", horaAplicacao);
   }

   public String getNomePesq() {
        return this.getVo().asString("NOMEPESQ");
   }

   public void setNomePesq(String nomePesq) {
        markAsChanged("NOMEPESQ", nomePesq);
   }

   public BigDecimal getNotaFinal() {
        return this.getVo().asBigDecimal("NOTAFINAL");
   }

   public void setNotaFinal(BigDecimal notaFinal) {
        markAsChanged("NOTAFINAL", notaFinal);
   }

   public BigDecimal getNuCurriculoPesq() {
        return this.getVo().asBigDecimal("NUCURRICULOPESQ");
   }

   public void setNuCurriculoPesq(BigDecimal nuCurriculoPesq) {
        markAsChanged("NUCURRICULOPESQ", nuCurriculoPesq);
   }

   public BigDecimal getNuPesq() {
        return this.getVo().asBigDecimal("NUPESQ");
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
   }

   public BigDecimal getNuPla() {
        return this.getVo().asBigDecimal("NUPLA");
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getTipoPesq() {
        return this.getVo().asString("TIPOPESQ");
   }

   public void setTipoPesq(String tipoPesq) {
        markAsChanged("TIPOPESQ", tipoPesq);
   }

   public BigDecimal getCodProdPesq() {
        return this.getVo().asBigDecimal("CODPRODPESQ");
   }

   public void setCodProdPesq(BigDecimal codProdPesq) {
        markAsChanged("CODPRODPESQ", codProdPesq);
   }

   public BigDecimal getCodContatoPesq() {
        return this.getVo().asBigDecimal("CODCONTATOPESQ");
   }

   public void setCodContatoPesq(BigDecimal codContatoPesq) {
        markAsChanged("CODCONTATOPESQ", codContatoPesq);
   }

   public BigDecimal getCodEmpFunPesq() {
        return this.getVo().asBigDecimal("CODEMPFUNPESQ");
   }

   public void setCodEmpFunPesq(BigDecimal codEmpFunPesq) {
        markAsChanged("CODEMPFUNPESQ", codEmpFunPesq);
   }

   public BigDecimal getCodFuncPesq() {
        return this.getVo().asBigDecimal("CODFUNCPESQ");
   }

   public void setCodFuncPesq(BigDecimal codFuncPesq) {
        markAsChanged("CODFUNCPESQ", codFuncPesq);
   }

   public BigDecimal getCodPapPesq() {
        return this.getVo().asBigDecimal("CODPAPPESQ");
   }

   public void setCodPapPesq(BigDecimal codPapPesq) {
        markAsChanged("CODPAPPESQ", codPapPesq);
   }

   public BigDecimal getCodParcPesq() {
        return this.getVo().asBigDecimal("CODPARCPESQ");
   }

   public void setCodParcPesq(BigDecimal codParcPesq) {
        markAsChanged("CODPARCPESQ", codParcPesq);
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
        this.setVo(vo);
        return this;
   }
}
