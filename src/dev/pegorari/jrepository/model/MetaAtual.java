package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MetaAtual extends AbstractSankhyaEntity<MetaAtual> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public BigDecimal getAntecipDesp() {
        return this.getVo().asBigDecimal("ANTECIPDESP");
   }

   public void setAntecipDesp(BigDecimal antecipDesp) {
        markAsChanged("ANTECIPDESP", antecipDesp);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodGer() {
        return this.getVo().asBigDecimal("CODGER");
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodGrupoNat() {
        return this.getVo().asBigDecimal("CODGRUPONAT");
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodPais() {
        return this.getVo().asBigDecimal("CODPAIS");
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getCompromissoDesp() {
        return this.getVo().asBigDecimal("COMPROMISSODESP");
   }

   public void setCompromissoDesp(BigDecimal compromissoDesp) {
        markAsChanged("COMPROMISSODESP", compromissoDesp);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getDia() {
        return this.getVo().asBigDecimal("DIA");
   }

   public void setDia(BigDecimal dia) {
        markAsChanged("DIA", dia);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public BigDecimal getPercAviso() {
        return this.getVo().asBigDecimal("PERCAVISO");
   }

   public void setPercAviso(BigDecimal percAviso) {
        markAsChanged("PERCAVISO", percAviso);
   }

   public BigDecimal getPercentual() {
        return this.getVo().asBigDecimal("PERCENTUAL");
   }

   public void setPercentual(BigDecimal percentual) {
        markAsChanged("PERCENTUAL", percentual);
   }

   public BigDecimal getPrevDesp() {
        return this.getVo().asBigDecimal("PREVDESP");
   }

   public void setPrevDesp(BigDecimal prevDesp) {
        markAsChanged("PREVDESP", prevDesp);
   }

   public BigDecimal getPrevRec() {
        return this.getVo().asBigDecimal("PREVREC");
   }

   public void setPrevRec(BigDecimal prevRec) {
        markAsChanged("PREVREC", prevRec);
   }

   public BigDecimal getQtdPrev() {
        return this.getVo().asBigDecimal("QTDPREV");
   }

   public void setQtdPrev(BigDecimal qtdPrev) {
        markAsChanged("QTDPREV", qtdPrev);
   }

   public BigDecimal getQtdReal() {
        return this.getVo().asBigDecimal("QTDREAL");
   }

   public void setQtdReal(BigDecimal qtdReal) {
        markAsChanged("QTDREAL", qtdReal);
   }

   public BigDecimal getRealDesp() {
        return this.getVo().asBigDecimal("REALDESP");
   }

   public void setRealDesp(BigDecimal realDesp) {
        markAsChanged("REALDESP", realDesp);
   }

   public BigDecimal getRealRec() {
        return this.getVo().asBigDecimal("REALREC");
   }

   public void setRealRec(BigDecimal realRec) {
        markAsChanged("REALREC", realRec);
   }

   public BigDecimal getReducaoDesp() {
        return this.getVo().asBigDecimal("REDUCAODESP");
   }

   public void setReducaoDesp(BigDecimal reducaoDesp) {
        markAsChanged("REDUCAODESP", reducaoDesp);
   }

   public BigDecimal getSemanaMes() {
        return this.getVo().asBigDecimal("SEMANAMES");
   }

   public void setSemanaMes(BigDecimal semanaMes) {
        markAsChanged("SEMANAMES", semanaMes);
   }

   public BigDecimal getSuplementoDesp() {
        return this.getVo().asBigDecimal("SUPLEMENTODESP");
   }

   public void setSuplementoDesp(BigDecimal suplementoDesp) {
        markAsChanged("SUPLEMENTODESP", suplementoDesp);
   }

   public String getTipoMsg() {
        return this.getVo().asString("TIPOMSG");
   }

   public void setTipoMsg(String tipoMsg) {
        markAsChanged("TIPOMSG", tipoMsg);
   }

   public BigDecimal getTotalAutInv() {
        return this.getVo().asBigDecimal("TOTALAUTINV");
   }

   public void setTotalAutInv(BigDecimal totalAutInv) {
        markAsChanged("TOTALAUTINV", totalAutInv);
   }

   public BigDecimal getTransfDesp() {
        return this.getVo().asBigDecimal("TRANSFDESP");
   }

   public void setTransfDesp(BigDecimal transfDesp) {
        markAsChanged("TRANSFDESP", transfDesp);
   }

   public BigDecimal getTransfSaldoDesp() {
        return this.getVo().asBigDecimal("TRANSFSALDODESP");
   }

   public void setTransfSaldoDesp(BigDecimal transfSaldoDesp) {
        markAsChanged("TRANSFSALDODESP", transfSaldoDesp);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   @Override
   public String getTableName() {
        return "TGMMET";
   }

   @Override
   public String getEntityName() {
        return "MetaAtual";
   }

   @Override
   public MetaAtual fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
