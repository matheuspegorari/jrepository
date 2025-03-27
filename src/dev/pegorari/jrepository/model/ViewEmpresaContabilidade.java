package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ViewEmpresaContabilidade extends AbstractSankhyaEntity<ViewEmpresaContabilidade> {
   public BigDecimal getCodCtaCtbEncRes() {
        return this.getVo().asBigDecimal("CODCTACTBENCRES");
   }

   public void setCodCtaCtbEncRes(BigDecimal codCtaCtbEncRes) {
        markAsChanged("CODCTACTBENCRES", codCtaCtbEncRes);
   }

   public String getAceitarHistZero() {
        return this.getVo().asString("ACEITARHISTZERO");
   }

   public void setAceitarHistZero(String aceitarHistZero) {
        markAsChanged("ACEITARHISTZERO", aceitarHistZero);
   }

   public BigDecimal getCorEmpresa() {
        return this.getVo().asBigDecimal("COREMPRESA");
   }

   public void setCorEmpresa(BigDecimal corEmpresa) {
        markAsChanged("COREMPRESA", corEmpresa);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getRazaoSocial() {
        return this.getVo().asString("RAZAOSOCIAL");
   }

   public void setRazaoSocial(String razaoSocial) {
        markAsChanged("RAZAOSOCIAL", razaoSocial);
   }

   public BigDecimal getUltimoNumeroUsado() {
        return this.getVo().asBigDecimal("ULTIMONUMEROUSADO");
   }

   public void setUltimoNumeroUsado(BigDecimal ultimoNumeroUsado) {
        markAsChanged("ULTIMONUMEROUSADO", ultimoNumeroUsado);
   }

   public Timestamp getDtFimPerCtb() {
        return this.getVo().asTimestamp("DTFIMPERCTB");
   }

   public void setDtFimPerCtb(Timestamp dtFimPerCtb) {
        markAsChanged("DTFIMPERCTB", dtFimPerCtb);
   }

   public BigDecimal getNroLoteMnualIni() {
        return this.getVo().asBigDecimal("NROLOTEMNUALINI");
   }

   public void setNroLoteMnualIni(BigDecimal nroLoteMnualIni) {
        markAsChanged("NROLOTEMNUALINI", nroLoteMnualIni);
   }

   public String getNumLoteSaut() {
        return this.getVo().asString("NUMLOTESAUT");
   }

   public void setNumLoteSaut(String numLoteSaut) {
        markAsChanged("NUMLOTESAUT", numLoteSaut);
   }

   public BigDecimal getNroLoteMnualFim() {
        return this.getVo().asBigDecimal("NROLOTEMNUALFIM");
   }

   public void setNroLoteMnualFim(BigDecimal nroLoteMnualFim) {
        markAsChanged("NROLOTEMNUALFIM", nroLoteMnualFim);
   }

   public String getMascCta() {
        return this.getVo().asString("MASCCTA");
   }

   public void setMascCta(String mascCta) {
        markAsChanged("MASCCTA", mascCta);
   }

   public Timestamp getDtInicPerCtb() {
        return this.getVo().asTimestamp("DTINICPERCTB");
   }

   public void setDtInicPerCtb(Timestamp dtInicPerCtb) {
        markAsChanged("DTINICPERCTB", dtInicPerCtb);
   }

   public String getPerAltQdCom() {
        return this.getVo().asString("PERALTQDCOM");
   }

   public void setPerAltQdCom(String perAltQdCom) {
        markAsChanged("PERALTQDCOM", perAltQdCom);
   }

   public BigDecimal getCodEmpPlaCta() {
        return this.getVo().asBigDecimal("CODEMPPLACTA");
   }

   public void setCodEmpPlaCta(BigDecimal codEmpPlaCta) {
        markAsChanged("CODEMPPLACTA", codEmpPlaCta);
   }

   public String getUtilProj() {
        return this.getVo().asString("UTILPROJ");
   }

   public void setUtilProj(String utilProj) {
        markAsChanged("UTILPROJ", utilProj);
   }

   public String getUtilCencus() {
        return this.getVo().asString("UTILCENCUS");
   }

   public void setUtilCencus(String utilCencus) {
        markAsChanged("UTILCENCUS", utilCencus);
   }

   public String getCodInstResp() {
        return this.getVo().asString("CODINSTRESP");
   }

   public void setCodInstResp(String codInstResp) {
        markAsChanged("CODINSTRESP", codInstResp);
   }

   public String getMascCtaExt() {
        return this.getVo().asString("MASCCTAEXT");
   }

   public void setMascCtaExt(String mascCtaExt) {
        markAsChanged("MASCCTAEXT", mascCtaExt);
   }

   @Override
   public String getTableName() {
        return "VCBEMP";
   }

   @Override
   public String getEntityName() {
        return "ViewEmpresaContabilidade";
   }

   @Override
   public ViewEmpresaContabilidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
