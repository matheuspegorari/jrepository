package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegraCalculo extends AbstractSankhyaEntity<RegraCalculo> {
   public String getAtuMovMen() {
        return this.getVo().asString("ATUMOVMEN");
   }

   public void setAtuMovMen(String atuMovMen) {
        markAsChanged("ATUMOVMEN", atuMovMen);
   }

   public String getCalcFerPerAqui() {
        return this.getVo().asString("CALCFERPERAQUI");
   }

   public void setCalcFerPerAqui(String calcFerPerAqui) {
        markAsChanged("CALCFERPERAQUI", calcFerPerAqui);
   }

   public String getCalcParcFer() {
        return this.getVo().asString("CALCPARCFER");
   }

   public void setCalcParcFer(String calcParcFer) {
        markAsChanged("CALCPARCFER", calcParcFer);
   }

   public String getCalcResiduo() {
        return this.getVo().asString("CALCRESIDUO");
   }

   public void setCalcResiduo(String calcResiduo) {
        markAsChanged("CALCRESIDUO", calcResiduo);
   }

   public String getCentIrf() {
        return this.getVo().asString("CENTIRF");
   }

   public void setCentIrf(String centIrf) {
        markAsChanged("CENTIRF", centIrf);
   }

   public String getCentValores() {
        return this.getVo().asString("CENTVALORES");
   }

   public void setCentValores(String centValores) {
        markAsChanged("CENTVALORES", centValores);
   }

   public BigDecimal getCodEvenBHoras() {
        return this.getVo().asBigDecimal("CODEVENBHORAS");
   }

   public void setCodEvenBHoras(BigDecimal codEvenBHoras) {
        markAsChanged("CODEVENBHORAS", codEvenBHoras);
   }

   public BigDecimal getCodEvenCred() {
        return this.getVo().asBigDecimal("CODEVENCRED");
   }

   public void setCodEvenCred(BigDecimal codEvenCred) {
        markAsChanged("CODEVENCRED", codEvenCred);
   }

   public BigDecimal getCodEvenDeb() {
        return this.getVo().asBigDecimal("CODEVENDEB");
   }

   public void setCodEvenDeb(BigDecimal codEvenDeb) {
        markAsChanged("CODEVENDEB", codEvenDeb);
   }

   public BigDecimal getCodEvenDomIn() {
        return this.getVo().asBigDecimal("CODEVENDOMIN");
   }

   public void setCodEvenDomIn(BigDecimal codEvenDomIn) {
        markAsChanged("CODEVENDOMIN", codEvenDomIn);
   }

   public BigDecimal getCodEvenNotUr() {
        return this.getVo().asBigDecimal("CODEVENNOTUR");
   }

   public void setCodEvenNotUr(BigDecimal codEvenNotUr) {
        markAsChanged("CODEVENNOTUR", codEvenNotUr);
   }

   public BigDecimal getCodEvenPadrao() {
        return this.getVo().asBigDecimal("CODEVENPADRAO");
   }

   public void setCodEvenPadrao(BigDecimal codEvenPadrao) {
        markAsChanged("CODEVENPADRAO", codEvenPadrao);
   }

   public BigDecimal getCodEvenPosPri() {
        return this.getVo().asBigDecimal("CODEVENPOSPRI");
   }

   public void setCodEvenPosPri(BigDecimal codEvenPosPri) {
        markAsChanged("CODEVENPOSPRI", codEvenPosPri);
   }

   public BigDecimal getCodEvenPri() {
        return this.getVo().asBigDecimal("CODEVENPRI");
   }

   public void setCodEvenPri(BigDecimal codEvenPri) {
        markAsChanged("CODEVENPRI", codEvenPri);
   }

   public BigDecimal getCodPref() {
        return this.getVo().asBigDecimal("CODPREF");
   }

   public void setCodPref(BigDecimal codPref) {
        markAsChanged("CODPREF", codPref);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCompensacao() {
        return this.getVo().asString("COMPENSACAO");
   }

   public void setCompensacao(String compensacao) {
        markAsChanged("COMPENSACAO", compensacao);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getDiaRetiradPd() {
        return this.getVo().asBigDecimal("DIARETIRADPD");
   }

   public void setDiaRetiradPd(BigDecimal diaRetiradPd) {
        markAsChanged("DIARETIRADPD", diaRetiradPd);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getFerPerPerAqui() {
        return this.getVo().asString("FERPROPERAQUI");
   }

   public void setFerPerPerAqui(String ferPerPerAqui) {
        markAsChanged("FERPROPERAQUI", ferPerPerAqui);
   }

   public String getFormaCalcMedias() {
        return this.getVo().asString("FORMACALCMEDIAS");
   }

   public void setFormaCalcMedias(String formaCalcMedias) {
        markAsChanged("FORMACALCMEDIAS", formaCalcMedias);
   }

   public BigDecimal getIrfMin() {
        return this.getVo().asBigDecimal("IRFMIN");
   }

   public void setIrfMin(BigDecimal irfMin) {
        markAsChanged("IRFMIN", irfMin);
   }

   public String getLancFerAdiant() {
        return this.getVo().asString("LANCFERADIANT");
   }

   public void setLancFerAdiant(String lancFerAdiant) {
        markAsChanged("LANCFERADIANT", lancFerAdiant);
   }

   public BigDecimal getLimMinHExtra() {
        return this.getVo().asBigDecimal("LIMMINHEXTRA");
   }

   public void setLimMinHExtra(BigDecimal limMinHExtra) {
        markAsChanged("LIMMINHEXTRA", limMinHExtra);
   }

   public BigDecimal getLimMinTolAtr() {
        return this.getVo().asBigDecimal("LIMMINTOLATR");
   }

   public void setLimMinTolAtr(BigDecimal limMinTolAtr) {
        markAsChanged("LIMMINTOLATR", limMinTolAtr);
   }

   public String getMediaAritim13() {
        return this.getVo().asString("MEDIAARITIM13");
   }

   public void setMediaAritim13(String mediaAritim13) {
        markAsChanged("MEDIAARITIM13", mediaAritim13);
   }

   public String getMediaPerFerias() {
        return this.getVo().asString("MEDIAPERFERIAS");
   }

   public void setMediaPerFerias(String mediaPerFerias) {
        markAsChanged("MEDIAPERFERIAS", mediaPerFerias);
   }

   public BigDecimal getMesCarencia() {
        return this.getVo().asBigDecimal("MESCARENCIA");
   }

   public void setMesCarencia(BigDecimal mesCarencia) {
        markAsChanged("MESCARENCIA", mesCarencia);
   }

   public BigDecimal getMesDataBase() {
        return this.getVo().asBigDecimal("MESDATABASE");
   }

   public void setMesDataBase(BigDecimal mesDataBase) {
        markAsChanged("MESDATABASE", mesDataBase);
   }

   public BigDecimal getMesesMedia13s() {
        return this.getVo().asBigDecimal("MESESMEDIA13S");
   }

   public void setMesesMedia13s(BigDecimal mesesMedia13s) {
        markAsChanged("MESESMEDIA13S", mesesMedia13s);
   }

   public BigDecimal getMesesMedia13s2() {
        return this.getVo().asBigDecimal("MESESMEDIA13S2");
   }

   public void setMesesMedia13s2(BigDecimal mesesMedia13s2) {
        markAsChanged("MESESMEDIA13S2", mesesMedia13s2);
   }

   public BigDecimal getMesesMediaFer() {
        return this.getVo().asBigDecimal("MESESMEDIAFER");
   }

   public void setMesesMediaFer(BigDecimal mesesMediaFer) {
        markAsChanged("MESESMEDIAFER", mesesMediaFer);
   }

   public BigDecimal getMesesMediaFer2() {
        return this.getVo().asBigDecimal("MESESMEDIAFER2");
   }

   public void setMesesMediaFer2(BigDecimal mesesMediaFer2) {
        markAsChanged("MESESMEDIAFER2", mesesMediaFer2);
   }

   public BigDecimal getMesesMediaResc() {
        return this.getVo().asBigDecimal("MESESMEDIARESC");
   }

   public void setMesesMediaResc(BigDecimal mesesMediaResc) {
        markAsChanged("MESESMEDIARESC", mesesMediaResc);
   }

   public BigDecimal getMesesMediaResc2() {
        return this.getVo().asBigDecimal("MESESMEDIARESC2");
   }

   public void setMesesMediaResc2(BigDecimal mesesMediaResc2) {
        markAsChanged("MESESMEDIARESC2", mesesMediaResc2);
   }

   public BigDecimal getPagAtraso() {
        return this.getVo().asBigDecimal("PAGATRASO");
   }

   public void setPagAtraso(BigDecimal pagAtraso) {
        markAsChanged("PAGATRASO", pagAtraso);
   }

   public BigDecimal getPagHsExtra() {
        return this.getVo().asBigDecimal("PAGHSEXTRA");
   }

   public void setPagHsExtra(BigDecimal pagHsExtra) {
        markAsChanged("PAGHSEXTRA", pagHsExtra);
   }

   public String getProvFerMedias() {
        return this.getVo().asString("PROVFERMEDIAS");
   }

   public void setProvFerMedias(String provFerMedias) {
        markAsChanged("PROVFERMEDIAS", provFerMedias);
   }

   public BigDecimal getQtdMaiores() {
        return this.getVo().asBigDecimal("QTDMAIORES");
   }

   public void setQtdMaiores(BigDecimal qtdMaiores) {
        markAsChanged("QTDMAIORES", qtdMaiores);
   }

   public BigDecimal getRemuMinima() {
        return this.getVo().asBigDecimal("REMUMINIMA");
   }

   public void setRemuMinima(BigDecimal remuMinima) {
        markAsChanged("REMUMINIMA", remuMinima);
   }

   public String getRespFolha() {
        return this.getVo().asString("RESPFOLHA");
   }

   public void setRespFolha(String respFolha) {
        markAsChanged("RESPFOLHA", respFolha);
   }

   public String getTipArred() {
        return this.getVo().asString("TIPARRED");
   }

   public void setTipArred(String tipArred) {
        markAsChanged("TIPARRED", tipArred);
   }

   public String getTipMes() {
        return this.getVo().asString("TIPMES");
   }

   public void setTipMes(String tipMes) {
        markAsChanged("TIPMES", tipMes);
   }

   public String getTipMovMedias() {
        return this.getVo().asString("TIPMOVMEDIAS");
   }

   public void setTipMovMedias(String tipMovMedias) {
        markAsChanged("TIPMOVMEDIAS", tipMovMedias);
   }

   public BigDecimal getArredSalLiq() {
        return this.getVo().asBigDecimal("ARREDSALLIQ");
   }

   public void setArredSalLiq(BigDecimal arredSalLiq) {
        markAsChanged("ARREDSALLIQ", arredSalLiq);
   }

   @Override
   public String getTableName() {
        return "TFPPRE";
   }

   @Override
   public String getEntityName() {
        return "RegraCalculo";
   }

   @Override
   public RegraCalculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
