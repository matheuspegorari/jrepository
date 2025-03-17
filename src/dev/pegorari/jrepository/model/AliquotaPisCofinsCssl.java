package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaPisCofinsCssl extends AbstractSankhyaEntity<AliquotaPisCofinsCssl> {
   private BigDecimal aliq;
   private BigDecimal aliqCred;
   private BigDecimal codEmp;
   private BigDecimal codParc;
   private BigDecimal codTab;
   private BigDecimal codTipOper;
   private BigDecimal cst;
   private String entSai;
   private String grupoImp;
   private String ipiIncBase;
   private BigDecimal iva;
   private String nomeImp;
   private String percVlr;
   private BigDecimal redBase;
   private String retemFin;
   private BigDecimal vlrPauta;
   private BigDecimal vlrPautaCred;
   private BigDecimal aliqSuframa;
   private String prodSemTrib;
   private BigDecimal idAliq;

   public BigDecimal getAliq() {
        return aliq;
   }

   public void setAliq(BigDecimal aliq) {
        this.aliq = aliq;
   }

   public BigDecimal getAliqCred() {
        return aliqCred;
   }

   public void setAliqCred(BigDecimal aliqCred) {
        this.aliqCred = aliqCred;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        this.codTab = codTab;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCst() {
        return cst;
   }

   public void setCst(BigDecimal cst) {
        this.cst = cst;
   }

   public String getEntSai() {
        return entSai;
   }

   public void setEntSai(String entSai) {
        this.entSai = entSai;
   }

   public String getGrupoImp() {
        return grupoImp;
   }

   public void setGrupoImp(String grupoImp) {
        this.grupoImp = grupoImp;
   }

   public String getIpiIncBase() {
        return ipiIncBase;
   }

   public void setIpiIncBase(String ipiIncBase) {
        this.ipiIncBase = ipiIncBase;
   }

   public BigDecimal getIva() {
        return iva;
   }

   public void setIva(BigDecimal iva) {
        this.iva = iva;
   }

   public String getNomeImp() {
        return nomeImp;
   }

   public void setNomeImp(String nomeImp) {
        this.nomeImp = nomeImp;
   }

   public String getPercVlr() {
        return percVlr;
   }

   public void setPercVlr(String percVlr) {
        this.percVlr = percVlr;
   }

   public BigDecimal getRedBase() {
        return redBase;
   }

   public void setRedBase(BigDecimal redBase) {
        this.redBase = redBase;
   }

   public String getRetemFin() {
        return retemFin;
   }

   public void setRetemFin(String retemFin) {
        this.retemFin = retemFin;
   }

   public BigDecimal getVlrPauta() {
        return vlrPauta;
   }

   public void setVlrPauta(BigDecimal vlrPauta) {
        this.vlrPauta = vlrPauta;
   }

   public BigDecimal getVlrPautaCred() {
        return vlrPautaCred;
   }

   public void setVlrPautaCred(BigDecimal vlrPautaCred) {
        this.vlrPautaCred = vlrPautaCred;
   }

   public BigDecimal getAliqSuframa() {
        return aliqSuframa;
   }

   public void setAliqSuframa(BigDecimal aliqSuframa) {
        this.aliqSuframa = aliqSuframa;
   }

   public String getProdSemTrib() {
        return prodSemTrib;
   }

   public void setProdSemTrib(String prodSemTrib) {
        this.prodSemTrib = prodSemTrib;
   }

   public BigDecimal getIdAliq() {
        return idAliq;
   }

   public void setIdAliq(BigDecimal idAliq) {
        this.idAliq = idAliq;
   }

   @Override
   public String getTableName() {
        return "TGFIFE";
   }

   @Override
   public String getEntityName() {
        return "AliquotaPisCofinsCssl";
   }

   @Override
   public AliquotaPisCofinsCssl fromVO(DynamicVO vo) {
        this.aliq = vo.asBigDecimal("ALIQ");
        this.aliqCred = vo.asBigDecimal("ALIQCRED");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.cst = vo.asBigDecimal("CST");
        this.entSai = vo.asString("ENTSAI");
        this.grupoImp = vo.asString("GRUPOIMP");
        this.ipiIncBase = vo.asString("IPIINCBASE");
        this.iva = vo.asBigDecimal("IVA");
        this.nomeImp = vo.asString("NOMEIMP");
        this.percVlr = vo.asString("PERCVLR");
        this.redBase = vo.asBigDecimal("REDBASE");
        this.retemFin = vo.asString("RETEMFIN");
        this.vlrPauta = vo.asBigDecimal("VLRPAUTA");
        this.vlrPautaCred = vo.asBigDecimal("VLRPAUTACRED");
        this.aliqSuframa = vo.asBigDecimal("ALIQSUFRAMA");
        this.prodSemTrib = vo.asString("PRODSEMTRIB");
        this.idAliq = vo.asBigDecimal("IDALIQ");
        return this;
   }
}
