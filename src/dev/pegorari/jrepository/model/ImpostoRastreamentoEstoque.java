package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostoRastreamentoEstoque extends AbstractSankhyaEntity<ImpostoRastreamentoEstoque> {
   public BigDecimal getBaseStfcpIntAnt() {
        return this.getVo().asBigDecimal("BASESTFCPINTANT");
   }

   public void setBaseStfcpIntAnt(BigDecimal baseStfcpIntAnt) {
        markAsChanged("BASESTFCPINTANT", baseStfcpIntAnt);
   }

   public BigDecimal getBaseSubst() {
        return this.getVo().asBigDecimal("BASESUBST");
   }

   public void setBaseSubst(BigDecimal baseSubst) {
        markAsChanged("BASESUBST", baseSubst);
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

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuNotaCompra() {
        return this.getVo().asBigDecimal("NUNOTACOMPRA");
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        markAsChanged("NUNOTACOMPRA", nuNotaCompra);
   }

   public BigDecimal getPercStfcpIntAnt() {
        return this.getVo().asBigDecimal("PERCSTFCPINTANT");
   }

   public void setPercStfcpIntAnt(BigDecimal percStfcpIntAnt) {
        markAsChanged("PERCSTFCPINTANT", percStfcpIntAnt);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSequenciaCompra() {
        return this.getVo().asBigDecimal("SEQUENCIACOMPRA");
   }

   public void setSequenciaCompra(BigDecimal sequenciaCompra) {
        markAsChanged("SEQUENCIACOMPRA", sequenciaCompra);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrStfcpIntAnt() {
        return this.getVo().asBigDecimal("VLRSTFCPINTANT");
   }

   public void setVlrStfcpIntAnt(BigDecimal vlrStfcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStfcpIntAnt);
   }

   public BigDecimal getVlrSubst() {
        return this.getVo().asBigDecimal("VLRSUBST");
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
   }

   public BigDecimal getPercSubst() {
        return this.getVo().asBigDecimal("PERCSUBST");
   }

   public void setPercSubst(BigDecimal percSubst) {
        markAsChanged("PERCSUBST", percSubst);
   }

   public BigDecimal getCodCfo() {
        return this.getVo().asBigDecimal("CODCFO");
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
   }

   public Timestamp getDtNeg() {
        return this.getVo().asTimestamp("DTNEG");
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   @Override
   public String getTableName() {
        return "TGFIPRE";
   }

   @Override
   public String getEntityName() {
        return "ImpostoRastreamentoEstoque";
   }

   @Override
   public ImpostoRastreamentoEstoque fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
