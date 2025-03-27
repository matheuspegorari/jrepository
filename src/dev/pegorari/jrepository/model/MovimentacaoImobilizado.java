package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentacaoImobilizado extends AbstractSankhyaEntity<MovimentacaoImobilizado> {
   public String getCodBem() {
        return this.getVo().asString("CODBEM");
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodDep() {
        return this.getVo().asBigDecimal("CODDEP");
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDtMovto() {
        return this.getVo().asTimestamp("DTMOVTO");
   }

   public void setDtMovto(Timestamp dtMovto) {
        markAsChanged("DTMOVTO", dtMovto);
   }

   public BigDecimal getNumLanc() {
        return this.getVo().asBigDecimal("NUMLANC");
   }

   public void setNumLanc(BigDecimal numLanc) {
        markAsChanged("NUMLANC", numLanc);
   }

   public BigDecimal getNumLote() {
        return this.getVo().asBigDecimal("NUMLOTE");
   }

   public void setNumLote(BigDecimal numLote) {
        markAsChanged("NUMLOTE", numLote);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getVlrDep() {
        return this.getVo().asBigDecimal("VLRDEP");
   }

   public void setVlrDep(BigDecimal vlrDep) {
        markAsChanged("VLRDEP", vlrDep);
   }

   @Override
   public String getTableName() {
        return "TCIMOV";
   }

   @Override
   public String getEntityName() {
        return "MovimentacaoImobilizado";
   }

   @Override
   public MovimentacaoImobilizado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
