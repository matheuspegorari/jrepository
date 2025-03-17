package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ViewEmpresaContabilidade implements SankhyaEntity<ViewEmpresaContabilidade> {

   private BigDecimal codCtaCtbEncRes;
   private String aceitarHistZero;
   private BigDecimal corEmpresa;
   private Timestamp referencia;
   private BigDecimal codEmp;
   private String razaoSocial;
   private BigDecimal ultimoNumeroUsado;
   private Timestamp dtFimPerCtb;
   private BigDecimal nroLoteMnualIni;
   private String numLoteSaut;
   private BigDecimal nroLoteMnualFim;
   private String mascCta;
   private Timestamp dtInicPerCtb;
   private String perAltQdCom;
   private BigDecimal codEmpPlaCta;
   private String utilProj;
   private String utilCenCus;
   private String codInstResp;
   private String mascCtaExt;

   public BigDecimal getCodCtaCtbEncRes() {
        return codCtaCtbEncRes;
   }

   public void setCodCtaCtbEncRes(BigDecimal codCtaCtbEncRes) {
        this.codCtaCtbEncRes = codCtaCtbEncRes;
   }

   public String getAceitarHistZero() {
        return aceitarHistZero;
   }

   public void setAceitarHistZero(String aceitarHistZero) {
        this.aceitarHistZero = aceitarHistZero;
   }

   public BigDecimal getCorEmpresa() {
        return corEmpresa;
   }

   public void setCorEmpresa(BigDecimal corEmpresa) {
        this.corEmpresa = corEmpresa;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getRazaoSocial() {
        return razaoSocial;
   }

   public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
   }

   public BigDecimal getUltimoNumeroUsado() {
        return ultimoNumeroUsado;
   }

   public void setUltimoNumeroUsado(BigDecimal ultimoNumeroUsado) {
        this.ultimoNumeroUsado = ultimoNumeroUsado;
   }

   public Timestamp getDtFimPerCtb() {
        return dtFimPerCtb;
   }

   public void setDtFimPerCtb(Timestamp dtFimPerCtb) {
        this.dtFimPerCtb = dtFimPerCtb;
   }

   public BigDecimal getNroLoteMnualIni() {
        return nroLoteMnualIni;
   }

   public void setNroLoteMnualIni(BigDecimal nroLoteMnualIni) {
        this.nroLoteMnualIni = nroLoteMnualIni;
   }

   public String getNumLoteSaut() {
        return numLoteSaut;
   }

   public void setNumLoteSaut(String numLoteSaut) {
        this.numLoteSaut = numLoteSaut;
   }

   public BigDecimal getNroLoteMnualFim() {
        return nroLoteMnualFim;
   }

   public void setNroLoteMnualFim(BigDecimal nroLoteMnualFim) {
        this.nroLoteMnualFim = nroLoteMnualFim;
   }

   public String getMascCta() {
        return mascCta;
   }

   public void setMascCta(String mascCta) {
        this.mascCta = mascCta;
   }

   public Timestamp getDtInicPerCtb() {
        return dtInicPerCtb;
   }

   public void setDtInicPerCtb(Timestamp dtInicPerCtb) {
        this.dtInicPerCtb = dtInicPerCtb;
   }

   public String getPerAltQdCom() {
        return perAltQdCom;
   }

   public void setPerAltQdCom(String perAltQdCom) {
        this.perAltQdCom = perAltQdCom;
   }

   public BigDecimal getCodEmpPlaCta() {
        return codEmpPlaCta;
   }

   public void setCodEmpPlaCta(BigDecimal codEmpPlaCta) {
        this.codEmpPlaCta = codEmpPlaCta;
   }

   public String getUtilProj() {
        return utilProj;
   }

   public void setUtilProj(String utilProj) {
        this.utilProj = utilProj;
   }

   public String getUtilCenCus() {
        return utilCenCus;
   }

   public void setUtilCenCus(String utilCenCus) {
        this.utilCenCus = utilCenCus;
   }

   public String getCodInstResp() {
        return codInstResp;
   }

   public void setCodInstResp(String codInstResp) {
        this.codInstResp = codInstResp;
   }

   public String getMascCtaExt() {
        return mascCtaExt;
   }

   public void setMascCtaExt(String mascCtaExt) {
        this.mascCtaExt = mascCtaExt;
   }

   @Override
   public String getEntityName() {
        return "ViewEmpresaContabilidade";
   }

   @Override
   public ViewEmpresaContabilidade fromVO(DynamicVO vo) {
        this.codCtaCtbEncRes = vo.asBigDecimal("CODCTACTBENCRES");
        this.aceitarHistZero = vo.asString("ACEITARHISTZERO");
        this.corEmpresa = vo.asBigDecimal("COREMPRESA");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.razaoSocial = vo.asString("RAZAOSOCIAL");
        this.ultimoNumeroUsado = vo.asBigDecimal("ULTIMONUMEROUSADO");
        this.dtFimPerCtb = vo.asTimestamp("DTFIMPERCTB");
        this.nroLoteMnualIni = vo.asBigDecimal("NROLOTEMNUALINI");
        this.numLoteSaut = vo.asString("NUMLOTESAUT");
        this.nroLoteMnualFim = vo.asBigDecimal("NROLOTEMNUALFIM");
        this.mascCta = vo.asString("MASCCTA");
        this.dtInicPerCtb = vo.asTimestamp("DTINICPERCTB");
        this.perAltQdCom = vo.asString("PERALTQDCOM");
        this.codEmpPlaCta = vo.asBigDecimal("CODEMPPLACTA");
        this.utilProj = vo.asString("UTILPROJ");
        this.utilCenCus = vo.asString("UTILCENCUS");
        this.codInstResp = vo.asString("CODINSTRESP");
        this.mascCtaExt = vo.asString("MASCCTAEXT");
        return this;
   }
}
