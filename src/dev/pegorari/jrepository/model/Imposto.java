package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Imposto extends AbstractSankhyaEntity<Imposto> {
   public String getAcumBaseIcms() {
        return this.getVo().asString("ACUMBASEICMS");
   }

   public void setAcumBaseIcms(String acumBaseIcms) {
        markAsChanged("ACUMBASEICMS", acumBaseIcms);
   }

   public String getAcumBaseIpi() {
        return this.getVo().asString("ACUMBASEIPI");
   }

   public void setAcumBaseIpi(String acumBaseIpi) {
        markAsChanged("ACUMBASEIPI", acumBaseIpi);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCalcBaseMensal() {
        return this.getVo().asString("CALCBASEMENSAL");
   }

   public void setCalcBaseMensal(String calcBaseMensal) {
        markAsChanged("CALCBASEMENSAL", calcBaseMensal);
   }

   public BigDecimal getCodCtaCtb1() {
        return this.getVo().asBigDecimal("CODCTACTB1");
   }

   public void setCodCtaCtb1(BigDecimal codCtaCtb1) {
        markAsChanged("CODCTACTB1", codCtaCtb1);
   }

   public BigDecimal getCodCtaCtb2() {
        return this.getVo().asBigDecimal("CODCTACTB2");
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
   }

   public BigDecimal getCodImp() {
        return this.getVo().asBigDecimal("CODIMP");
   }

   public void setCodImp(BigDecimal codImp) {
        markAsChanged("CODIMP", codImp);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getImpBaixaParcial() {
        return this.getVo().asString("IMPBAIXAPARCIAL");
   }

   public void setImpBaixaParcial(String impBaixaParcial) {
        markAsChanged("IMPBAIXAPARCIAL", impBaixaParcial);
   }

   public String getNomeImp() {
        return this.getVo().asString("NOMEIMP");
   }

   public void setNomeImp(String nomeImp) {
        markAsChanged("NOMEIMP", nomeImp);
   }

   public String getRegra() {
        return this.getVo().asString("REGRA");
   }

   public void setRegra(String regra) {
        markAsChanged("REGRA", regra);
   }

   public BigDecimal getTipoImposto() {
        return this.getVo().asBigDecimal("TIPOIMPOSTO");
   }

   public void setTipoImposto(BigDecimal tipoImposto) {
        markAsChanged("TIPOIMPOSTO", tipoImposto);
   }

   public String getUsarPrecoCusto() {
        return this.getVo().asString("USARPRECOCUSTO");
   }

   public void setUsarPrecoCusto(String usarPrecoCusto) {
        markAsChanged("USARPRECOCUSTO", usarPrecoCusto);
   }

   public BigDecimal getVlrMin() {
        return this.getVo().asBigDecimal("VLRMIN");
   }

   public void setVlrMin(BigDecimal vlrMin) {
        markAsChanged("VLRMIN", vlrMin);
   }

   public String getGrupoVlrMin() {
        return this.getVo().asString("GRUPOVLRMIN");
   }

   public void setGrupoVlrMin(String grupoVlrMin) {
        markAsChanged("GRUPOVLRMIN", grupoVlrMin);
   }

   public String getConsiderarImp() {
        return this.getVo().asString("CONSIDERARIMP");
   }

   public void setConsiderarImp(String considerarImp) {
        markAsChanged("CONSIDERARIMP", considerarImp);
   }

   public String getBaseImpFin() {
        return this.getVo().asString("BASEIMPFIN");
   }

   public void setBaseImpFin(String baseImpFin) {
        markAsChanged("BASEIMPFIN", baseImpFin);
   }

   public String getCodRec() {
        return this.getVo().asString("CODREC");
   }

   public void setCodRec(String codRec) {
        markAsChanged("CODREC", codRec);
   }

   public String getImpFrete() {
        return this.getVo().asString("IMPFRETE");
   }

   public void setImpFrete(String impFrete) {
        markAsChanged("IMPFRETE", impFrete);
   }

   public String getF600Efd() {
        return this.getVo().asString("F600EFD");
   }

   public void setF600Efd(String f600Efd) {
        markAsChanged("F600EFD", f600Efd);
   }

   public BigDecimal getVlrMaxInss() {
        return this.getVo().asBigDecimal("VLRMAXINSS");
   }

   public void setVlrMaxInss(BigDecimal vlrMaxInss) {
        markAsChanged("VLRMAXINSS", vlrMaxInss);
   }

   public String getRegCalcImpRet() {
        return this.getVo().asString("REGCALCIMPRET");
   }

   public void setRegCalcImpRet(String regCalcImpRet) {
        markAsChanged("REGCALCIMPRET", regCalcImpRet);
   }

   public String getCalcBaseDia() {
        return this.getVo().asString("CALCBASDIA");
   }

   public void setCalcBaseDia(String calcBaseDia) {
        markAsChanged("CALCBASDIA", calcBaseDia);
   }

   @Override
   public String getTableName() {
        return "TGFIMC";
   }

   @Override
   public String getEntityName() {
        return "Imposto";
   }

   @Override
   public Imposto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
