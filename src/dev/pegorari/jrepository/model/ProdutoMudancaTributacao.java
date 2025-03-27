package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoMudancaTributacao extends AbstractSankhyaEntity<ProdutoMudancaTributacao> {
   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getAliqSt() {
        return this.getVo().asBigDecimal("ALIQST");
   }

   public void setAliqSt(BigDecimal aliqSt) {
        markAsChanged("ALIQST", aliqSt);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
   }

   public BigDecimal getBaseSubstit() {
        return this.getVo().asBigDecimal("BASESUBSTIT");
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
   }

   public BigDecimal getBaseSubstitCompra() {
        return this.getVo().asBigDecimal("BASESUBSTITCOMPRA");
   }

   public void setBaseSubstitCompra(BigDecimal baseSubstitCompra) {
        markAsChanged("BASESUBSTITCOMPRA", baseSubstitCompra);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodParcCompra() {
        return this.getVo().asBigDecimal("CODPARCCOMPRA");
   }

   public void setCodParcCompra(BigDecimal codParcCompra) {
        markAsChanged("CODPARCCOMPRA", codParcCompra);
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

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getCst() {
        return this.getVo().asBigDecimal("CST");
   }

   public void setCst(BigDecimal cst) {
        markAsChanged("CST", cst);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtMtp() {
        return this.getVo().asTimestamp("DTMTP");
   }

   public void setDtMtp(Timestamp dtMtp) {
        markAsChanged("DTMTP", dtMtp);
   }

   public BigDecimal getIdAliq() {
        return this.getVo().asBigDecimal("IDALIQ");
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
   }

   public BigDecimal getMva() {
        return this.getVo().asBigDecimal("MVA");
   }

   public void setMva(BigDecimal mva) {
        markAsChanged("MVA", mva);
   }

   public String getNcm() {
        return this.getVo().asString("NCM");
   }

   public void setNcm(String ncm) {
        markAsChanged("NCM", ncm);
   }

   public BigDecimal getNuNotaCompra() {
        return this.getVo().asBigDecimal("NUNOTACOMPRA");
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        markAsChanged("NUNOTACOMPRA", nuNotaCompra);
   }

   public BigDecimal getQtdEst() {
        return this.getVo().asBigDecimal("QTDEST");
   }

   public void setQtdEst(BigDecimal qtdEst) {
        markAsChanged("QTDEST", qtdEst);
   }

   public String getUsoProd() {
        return this.getVo().asString("USOPROD");
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrIcmsCompra() {
        return this.getVo().asBigDecimal("VLRICMSCOMPRA");
   }

   public void setVlrIcmsCompra(BigDecimal vlrIcmsCompra) {
        markAsChanged("VLRICMSCOMPRA", vlrIcmsCompra);
   }

   public BigDecimal getVlrUnitCusto() {
        return this.getVo().asBigDecimal("VLRUNITCUSTO");
   }

   public void setVlrUnitCusto(BigDecimal vlrUnitCusto) {
        markAsChanged("VLRUNITCUSTO", vlrUnitCusto);
   }

   public BigDecimal getBaseIcmsSt() {
        return this.getVo().asBigDecimal("BASEICMSST");
   }

   public void setBaseIcmsSt(BigDecimal baseIcmsSt) {
        markAsChanged("BASEICMSST", baseIcmsSt);
   }

   public BigDecimal getCstAnterior() {
        return this.getVo().asBigDecimal("CSTANTERIOR");
   }

   public void setCstAnterior(BigDecimal cstAnterior) {
        markAsChanged("CSTANTERIOR", cstAnterior);
   }

   public BigDecimal getIdAliqAnterior() {
        return this.getVo().asBigDecimal("IDALIQANTERIOR");
   }

   public void setIdAliqAnterior(BigDecimal idAliqAnterior) {
        markAsChanged("IDALIQANTERIOR", idAliqAnterior);
   }

   public BigDecimal getVlrIcmsSt() {
        return this.getVo().asBigDecimal("VLRICMSST");
   }

   public void setVlrIcmsSt(BigDecimal vlrIcmsSt) {
        markAsChanged("VLRICMSST", vlrIcmsSt);
   }

   public BigDecimal getBaseStEstoque() {
        return this.getVo().asBigDecimal("BASESTESTOQUE");
   }

   public void setBaseStEstoque(BigDecimal baseStEstoque) {
        markAsChanged("BASESTESTOQUE", baseStEstoque);
   }

   public String getVlrCusUtil() {
        return this.getVo().asString("VLRCUSUTIL");
   }

   public void setVlrCusUtil(String vlrCusUtil) {
        markAsChanged("VLRCUSUTIL", vlrCusUtil);
   }

   public BigDecimal getVlrIcmsUnit() {
        return this.getVo().asBigDecimal("VLRICMSUNIT");
   }

   public void setVlrIcmsUnit(BigDecimal vlrIcmsUnit) {
        markAsChanged("VLRICMSUNIT", vlrIcmsUnit);
   }

   @Override
   public String getTableName() {
        return "TGFPMT";
   }

   @Override
   public String getEntityName() {
        return "ProdutoMudancaTributacao";
   }

   @Override
   public ProdutoMudancaTributacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
