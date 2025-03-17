package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Meta implements SankhyaEntity<Meta> {

   private String analitico;
   private BigDecimal antecipDesp;
   private BigDecimal codCencus;
   private BigDecimal codCid;
   private BigDecimal codEmp;
   private BigDecimal codGer;
   private BigDecimal codGrupoProd;
   private BigDecimal codLocal;
   private BigDecimal codMeta;
   private BigDecimal codNat;
   private BigDecimal codPais;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codProj;
   private BigDecimal codReg;
   private BigDecimal codTipParc;
   private BigDecimal codUf;
   private BigDecimal codVend;
   private String codVol;
   private BigDecimal compromissoDesp;
   private String controle;
   private BigDecimal dia;
   private Timestamp dtRef;
   private String marca;
   private BigDecimal percAviso;
   private BigDecimal percentual;
   private BigDecimal prevDesp;
   private BigDecimal prevRec;
   private BigDecimal qtdPrev;
   private BigDecimal qtdReal;
   private BigDecimal realDesp;
   private BigDecimal realRec;
   private BigDecimal reducaoDesp;
   private BigDecimal semanaMes;
   private BigDecimal suplementoDesp;
   private String tipoMsg;
   private BigDecimal totalAutInv;
   private BigDecimal transfDesp;
   private BigDecimal transfSaldoDesp;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public BigDecimal getAntecipDesp() {
        return antecipDesp;
   }

   public void setAntecipDesp(BigDecimal antecipDesp) {
        this.antecipDesp = antecipDesp;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGer() {
        return codGer;
   }

   public void setCodGer(BigDecimal codGer) {
        this.codGer = codGer;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        this.codPais = codPais;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        this.codReg = codReg;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        this.codTipParc = codTipParc;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getCompromissoDesp() {
        return compromissoDesp;
   }

   public void setCompromissoDesp(BigDecimal compromissoDesp) {
        this.compromissoDesp = compromissoDesp;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getDia() {
        return dia;
   }

   public void setDia(BigDecimal dia) {
        this.dia = dia;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        this.marca = marca;
   }

   public BigDecimal getPercAviso() {
        return percAviso;
   }

   public void setPercAviso(BigDecimal percAviso) {
        this.percAviso = percAviso;
   }

   public BigDecimal getPercentual() {
        return percentual;
   }

   public void setPercentual(BigDecimal percentual) {
        this.percentual = percentual;
   }

   public BigDecimal getPrevDesp() {
        return prevDesp;
   }

   public void setPrevDesp(BigDecimal prevDesp) {
        this.prevDesp = prevDesp;
   }

   public BigDecimal getPrevRec() {
        return prevRec;
   }

   public void setPrevRec(BigDecimal prevRec) {
        this.prevRec = prevRec;
   }

   public BigDecimal getQtdPrev() {
        return qtdPrev;
   }

   public void setQtdPrev(BigDecimal qtdPrev) {
        this.qtdPrev = qtdPrev;
   }

   public BigDecimal getQtdReal() {
        return qtdReal;
   }

   public void setQtdReal(BigDecimal qtdReal) {
        this.qtdReal = qtdReal;
   }

   public BigDecimal getRealDesp() {
        return realDesp;
   }

   public void setRealDesp(BigDecimal realDesp) {
        this.realDesp = realDesp;
   }

   public BigDecimal getRealRec() {
        return realRec;
   }

   public void setRealRec(BigDecimal realRec) {
        this.realRec = realRec;
   }

   public BigDecimal getReducaoDesp() {
        return reducaoDesp;
   }

   public void setReducaoDesp(BigDecimal reducaoDesp) {
        this.reducaoDesp = reducaoDesp;
   }

   public BigDecimal getSemanaMes() {
        return semanaMes;
   }

   public void setSemanaMes(BigDecimal semanaMes) {
        this.semanaMes = semanaMes;
   }

   public BigDecimal getSuplementoDesp() {
        return suplementoDesp;
   }

   public void setSuplementoDesp(BigDecimal suplementoDesp) {
        this.suplementoDesp = suplementoDesp;
   }

   public String getTipoMsg() {
        return tipoMsg;
   }

   public void setTipoMsg(String tipoMsg) {
        this.tipoMsg = tipoMsg;
   }

   public BigDecimal getTotalAutInv() {
        return totalAutInv;
   }

   public void setTotalAutInv(BigDecimal totalAutInv) {
        this.totalAutInv = totalAutInv;
   }

   public BigDecimal getTransfDesp() {
        return transfDesp;
   }

   public void setTransfDesp(BigDecimal transfDesp) {
        this.transfDesp = transfDesp;
   }

   public BigDecimal getTransfSaldoDesp() {
        return transfSaldoDesp;
   }

   public void setTransfSaldoDesp(BigDecimal transfSaldoDesp) {
        this.transfSaldoDesp = transfSaldoDesp;
   }

   @Override
   public String getEntityName() {
        return "Meta";
   }

   @Override
   public Meta fromVO(DynamicVO vo) {
        this.analitico = vo.asString("ANALITICO");
        this.antecipDesp = vo.asBigDecimal("ANTECIPDESP");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGer = vo.asBigDecimal("CODGER");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.codVol = vo.asString("CODVOL");
        this.compromissoDesp = vo.asBigDecimal("COMPROMISSODESP");
        this.controle = vo.asString("CONTROLE");
        this.dia = vo.asBigDecimal("DIA");
        this.dtRef = vo.asTimestamp("DTREF");
        this.marca = vo.asString("MARCA");
        this.percAviso = vo.asBigDecimal("PERCAVISO");
        this.percentual = vo.asBigDecimal("PERCENTUAL");
        this.prevDesp = vo.asBigDecimal("PREVDESP");
        this.prevRec = vo.asBigDecimal("PREVREC");
        this.qtdPrev = vo.asBigDecimal("QTDPREV");
        this.qtdReal = vo.asBigDecimal("QTDREAL");
        this.realDesp = vo.asBigDecimal("REALDESP");
        this.realRec = vo.asBigDecimal("REALREC");
        this.reducaoDesp = vo.asBigDecimal("REDUCAODESP");
        this.semanaMes = vo.asBigDecimal("SEMANAMES");
        this.suplementoDesp = vo.asBigDecimal("SUPLEMENTODESP");
        this.tipoMsg = vo.asString("TIPOMSG");
        this.totalAutInv = vo.asBigDecimal("TOTALAUTINV");
        this.transfDesp = vo.asBigDecimal("TRANSFDESP");
        this.transfSaldoDesp = vo.asBigDecimal("TRANSFSALDODESP");
        return this;
   }
}
