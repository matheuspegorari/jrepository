package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegraCalculo implements SankhyaEntity<RegraCalculo> {

   private String atuMovMen;
   private String calcFerPerAqui;
   private String calcParcFer;
   private String calcResiduo;
   private String centIrf;
   private String centValores;
   private BigDecimal codEvenBHoras;
   private BigDecimal codEvenCred;
   private BigDecimal codEvenDeb;
   private BigDecimal codEvenDomIn;
   private BigDecimal codEvenNotUr;
   private BigDecimal codEvenPadrao;
   private BigDecimal codEvenPosPri;
   private BigDecimal codEvenPri;
   private BigDecimal codPref;
   private BigDecimal codUsu;
   private String compensacao;
   private String descricao;
   private BigDecimal diaRetiradPd;
   private Timestamp dtAlter;
   private String ferProPerAqui;
   private String formaCalcMedias;
   private BigDecimal irfMin;
   private String lancFerAdiant;
   private BigDecimal limMinHExtra;
   private BigDecimal limMinTolAtr;
   private String mediaAritim13;
   private String mediaPerFerias;
   private BigDecimal mesCarencia;
   private BigDecimal mesDataBase;
   private BigDecimal mesesMedia13s;
   private BigDecimal mesesMedia13s2;
   private BigDecimal mesesMediaFer;
   private BigDecimal mesesMediaFer2;
   private BigDecimal mesesMediaResc;
   private BigDecimal mesesMediaResc2;
   private BigDecimal pagAtraso;
   private BigDecimal pagHsExtra;
   private String provFerMedias;
   private BigDecimal qtdMaiores;
   private BigDecimal remuMinima;
   private String respFolha;
   private String tipArred;
   private String tipMes;
   private String tipMovMedias;
   private BigDecimal arredsAllIq;

   public String getAtuMovMen() {
        return atuMovMen;
   }

   public void setAtuMovMen(String atuMovMen) {
        this.atuMovMen = atuMovMen;
   }

   public String getCalcFerPerAqui() {
        return calcFerPerAqui;
   }

   public void setCalcFerPerAqui(String calcFerPerAqui) {
        this.calcFerPerAqui = calcFerPerAqui;
   }

   public String getCalcParcFer() {
        return calcParcFer;
   }

   public void setCalcParcFer(String calcParcFer) {
        this.calcParcFer = calcParcFer;
   }

   public String getCalcResiduo() {
        return calcResiduo;
   }

   public void setCalcResiduo(String calcResiduo) {
        this.calcResiduo = calcResiduo;
   }

   public String getCentIrf() {
        return centIrf;
   }

   public void setCentIrf(String centIrf) {
        this.centIrf = centIrf;
   }

   public String getCentValores() {
        return centValores;
   }

   public void setCentValores(String centValores) {
        this.centValores = centValores;
   }

   public BigDecimal getCodEvenBHoras() {
        return codEvenBHoras;
   }

   public void setCodEvenBHoras(BigDecimal codEvenBHoras) {
        this.codEvenBHoras = codEvenBHoras;
   }

   public BigDecimal getCodEvenCred() {
        return codEvenCred;
   }

   public void setCodEvenCred(BigDecimal codEvenCred) {
        this.codEvenCred = codEvenCred;
   }

   public BigDecimal getCodEvenDeb() {
        return codEvenDeb;
   }

   public void setCodEvenDeb(BigDecimal codEvenDeb) {
        this.codEvenDeb = codEvenDeb;
   }

   public BigDecimal getCodEvenDomIn() {
        return codEvenDomIn;
   }

   public void setCodEvenDomIn(BigDecimal codEvenDomIn) {
        this.codEvenDomIn = codEvenDomIn;
   }

   public BigDecimal getCodEvenNotUr() {
        return codEvenNotUr;
   }

   public void setCodEvenNotUr(BigDecimal codEvenNotUr) {
        this.codEvenNotUr = codEvenNotUr;
   }

   public BigDecimal getCodEvenPadrao() {
        return codEvenPadrao;
   }

   public void setCodEvenPadrao(BigDecimal codEvenPadrao) {
        this.codEvenPadrao = codEvenPadrao;
   }

   public BigDecimal getCodEvenPosPri() {
        return codEvenPosPri;
   }

   public void setCodEvenPosPri(BigDecimal codEvenPosPri) {
        this.codEvenPosPri = codEvenPosPri;
   }

   public BigDecimal getCodEvenPri() {
        return codEvenPri;
   }

   public void setCodEvenPri(BigDecimal codEvenPri) {
        this.codEvenPri = codEvenPri;
   }

   public BigDecimal getCodPref() {
        return codPref;
   }

   public void setCodPref(BigDecimal codPref) {
        this.codPref = codPref;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCompensacao() {
        return compensacao;
   }

   public void setCompensacao(String compensacao) {
        this.compensacao = compensacao;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getDiaRetiradPd() {
        return diaRetiradPd;
   }

   public void setDiaRetiradPd(BigDecimal diaRetiradPd) {
        this.diaRetiradPd = diaRetiradPd;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getFerProPerAqui() {
        return ferProPerAqui;
   }

   public void setFerProPerAqui(String ferProPerAqui) {
        this.ferProPerAqui = ferProPerAqui;
   }

   public String getFormaCalcMedias() {
        return formaCalcMedias;
   }

   public void setFormaCalcMedias(String formaCalcMedias) {
        this.formaCalcMedias = formaCalcMedias;
   }

   public BigDecimal getIrfMin() {
        return irfMin;
   }

   public void setIrfMin(BigDecimal irfMin) {
        this.irfMin = irfMin;
   }

   public String getLancFerAdiant() {
        return lancFerAdiant;
   }

   public void setLancFerAdiant(String lancFerAdiant) {
        this.lancFerAdiant = lancFerAdiant;
   }

   public BigDecimal getLimMinHExtra() {
        return limMinHExtra;
   }

   public void setLimMinHExtra(BigDecimal limMinHExtra) {
        this.limMinHExtra = limMinHExtra;
   }

   public BigDecimal getLimMinTolAtr() {
        return limMinTolAtr;
   }

   public void setLimMinTolAtr(BigDecimal limMinTolAtr) {
        this.limMinTolAtr = limMinTolAtr;
   }

   public String getMediaAritim13() {
        return mediaAritim13;
   }

   public void setMediaAritim13(String mediaAritim13) {
        this.mediaAritim13 = mediaAritim13;
   }

   public String getMediaPerFerias() {
        return mediaPerFerias;
   }

   public void setMediaPerFerias(String mediaPerFerias) {
        this.mediaPerFerias = mediaPerFerias;
   }

   public BigDecimal getMesCarencia() {
        return mesCarencia;
   }

   public void setMesCarencia(BigDecimal mesCarencia) {
        this.mesCarencia = mesCarencia;
   }

   public BigDecimal getMesDataBase() {
        return mesDataBase;
   }

   public void setMesDataBase(BigDecimal mesDataBase) {
        this.mesDataBase = mesDataBase;
   }

   public BigDecimal getMesesMedia13s() {
        return mesesMedia13s;
   }

   public void setMesesMedia13s(BigDecimal mesesMedia13s) {
        this.mesesMedia13s = mesesMedia13s;
   }

   public BigDecimal getMesesMedia13s2() {
        return mesesMedia13s2;
   }

   public void setMesesMedia13s2(BigDecimal mesesMedia13s2) {
        this.mesesMedia13s2 = mesesMedia13s2;
   }

   public BigDecimal getMesesMediaFer() {
        return mesesMediaFer;
   }

   public void setMesesMediaFer(BigDecimal mesesMediaFer) {
        this.mesesMediaFer = mesesMediaFer;
   }

   public BigDecimal getMesesMediaFer2() {
        return mesesMediaFer2;
   }

   public void setMesesMediaFer2(BigDecimal mesesMediaFer2) {
        this.mesesMediaFer2 = mesesMediaFer2;
   }

   public BigDecimal getMesesMediaResc() {
        return mesesMediaResc;
   }

   public void setMesesMediaResc(BigDecimal mesesMediaResc) {
        this.mesesMediaResc = mesesMediaResc;
   }

   public BigDecimal getMesesMediaResc2() {
        return mesesMediaResc2;
   }

   public void setMesesMediaResc2(BigDecimal mesesMediaResc2) {
        this.mesesMediaResc2 = mesesMediaResc2;
   }

   public BigDecimal getPagAtraso() {
        return pagAtraso;
   }

   public void setPagAtraso(BigDecimal pagAtraso) {
        this.pagAtraso = pagAtraso;
   }

   public BigDecimal getPagHsExtra() {
        return pagHsExtra;
   }

   public void setPagHsExtra(BigDecimal pagHsExtra) {
        this.pagHsExtra = pagHsExtra;
   }

   public String getProvFerMedias() {
        return provFerMedias;
   }

   public void setProvFerMedias(String provFerMedias) {
        this.provFerMedias = provFerMedias;
   }

   public BigDecimal getQtdMaiores() {
        return qtdMaiores;
   }

   public void setQtdMaiores(BigDecimal qtdMaiores) {
        this.qtdMaiores = qtdMaiores;
   }

   public BigDecimal getRemuMinima() {
        return remuMinima;
   }

   public void setRemuMinima(BigDecimal remuMinima) {
        this.remuMinima = remuMinima;
   }

   public String getRespFolha() {
        return respFolha;
   }

   public void setRespFolha(String respFolha) {
        this.respFolha = respFolha;
   }

   public String getTipArred() {
        return tipArred;
   }

   public void setTipArred(String tipArred) {
        this.tipArred = tipArred;
   }

   public String getTipMes() {
        return tipMes;
   }

   public void setTipMes(String tipMes) {
        this.tipMes = tipMes;
   }

   public String getTipMovMedias() {
        return tipMovMedias;
   }

   public void setTipMovMedias(String tipMovMedias) {
        this.tipMovMedias = tipMovMedias;
   }

   public BigDecimal getArredsAllIq() {
        return arredsAllIq;
   }

   public void setArredsAllIq(BigDecimal arredsAllIq) {
        this.arredsAllIq = arredsAllIq;
   }

   @Override
   public String getEntityName() {
        return "RegraCalculo";
   }

   @Override
   public RegraCalculo fromVO(DynamicVO vo) {
        this.atuMovMen = vo.asString("ATUMOVMEN");
        this.calcFerPerAqui = vo.asString("CALCFERPERAQUI");
        this.calcParcFer = vo.asString("CALCPARCFER");
        this.calcResiduo = vo.asString("CALCRESIDUO");
        this.centIrf = vo.asString("CENTIRF");
        this.centValores = vo.asString("CENTVALORES");
        this.codEvenBHoras = vo.asBigDecimal("CODEVENBHORAS");
        this.codEvenCred = vo.asBigDecimal("CODEVENCRED");
        this.codEvenDeb = vo.asBigDecimal("CODEVENDEB");
        this.codEvenDomIn = vo.asBigDecimal("CODEVENDOMIN");
        this.codEvenNotUr = vo.asBigDecimal("CODEVENNOTUR");
        this.codEvenPadrao = vo.asBigDecimal("CODEVENPADRAO");
        this.codEvenPosPri = vo.asBigDecimal("CODEVENPOSPRI");
        this.codEvenPri = vo.asBigDecimal("CODEVENPRI");
        this.codPref = vo.asBigDecimal("CODPREF");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.compensacao = vo.asString("COMPENSACAO");
        this.descricao = vo.asString("DESCRICAO");
        this.diaRetiradPd = vo.asBigDecimal("DIARETIRADPD");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.ferProPerAqui = vo.asString("FERPROPERAQUI");
        this.formaCalcMedias = vo.asString("FORMACALCMEDIAS");
        this.irfMin = vo.asBigDecimal("IRFMIN");
        this.lancFerAdiant = vo.asString("LANCFERADIANT");
        this.limMinHExtra = vo.asBigDecimal("LIMMINHEXTRA");
        this.limMinTolAtr = vo.asBigDecimal("LIMMINTOLATR");
        this.mediaAritim13 = vo.asString("MEDIAARITIM13");
        this.mediaPerFerias = vo.asString("MEDIAPERFERIAS");
        this.mesCarencia = vo.asBigDecimal("MESCARENCIA");
        this.mesDataBase = vo.asBigDecimal("MESDATABASE");
        this.mesesMedia13s = vo.asBigDecimal("MESESMEDIA13S");
        this.mesesMedia13s2 = vo.asBigDecimal("MESESMEDIA13S2");
        this.mesesMediaFer = vo.asBigDecimal("MESESMEDIAFER");
        this.mesesMediaFer2 = vo.asBigDecimal("MESESMEDIAFER2");
        this.mesesMediaResc = vo.asBigDecimal("MESESMEDIARESC");
        this.mesesMediaResc2 = vo.asBigDecimal("MESESMEDIARESC2");
        this.pagAtraso = vo.asBigDecimal("PAGATRASO");
        this.pagHsExtra = vo.asBigDecimal("PAGHSEXTRA");
        this.provFerMedias = vo.asString("PROVFERMEDIAS");
        this.qtdMaiores = vo.asBigDecimal("QTDMAIORES");
        this.remuMinima = vo.asBigDecimal("REMUMINIMA");
        this.respFolha = vo.asString("RESPFOLHA");
        this.tipArred = vo.asString("TIPARRED");
        this.tipMes = vo.asString("TIPMES");
        this.tipMovMedias = vo.asString("TIPMOVMEDIAS");
        this.arredsAllIq = vo.asBigDecimal("ARREDSALLIQ");
        return this;
   }
}
