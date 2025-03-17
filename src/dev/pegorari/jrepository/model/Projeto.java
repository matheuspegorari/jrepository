package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Projeto implements SankhyaEntity<Projeto> {

   private String abreviatura;
   private BigDecimal amostraCusMax;
   private String analitico;
   private String ativo;
   private BigDecimal cargaHorMax;
   private BigDecimal codClt;
   private BigDecimal codCtaCtb;
   private BigDecimal codCtaCtb2;
   private BigDecimal codEmp;
   private BigDecimal codProd;
   private BigDecimal codProj;
   private BigDecimal codProjPai;
   private BigDecimal codUsuResp;
   private Timestamp dtInicio;
   private Timestamp dtTermino;
   private BigDecimal grau;
   private BigDecimal hrFinalMax;
   private BigDecimal hrInicialMin;
   private String identificacao;
   private BigDecimal intervaloMax;
   private BigDecimal intervaloMin;
   private BigDecimal limBonif;
   private BigDecimal nuQue;
   private BigDecimal percRetencao;
   private String retencaoAtiva;
   private BigDecimal ultimoRdo;
   private String timContaCompart;
   private BigDecimal timNmCtaComp;
   private BigDecimal timParcProj;
   private BigDecimal timTxPart;

   public String getAbreviatura() {
        return abreviatura;
   }

   public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
   }

   public BigDecimal getAmostraCusMax() {
        return amostraCusMax;
   }

   public void setAmostraCusMax(BigDecimal amostraCusMax) {
        this.amostraCusMax = amostraCusMax;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCargaHorMax() {
        return cargaHorMax;
   }

   public void setCargaHorMax(BigDecimal cargaHorMax) {
        this.cargaHorMax = cargaHorMax;
   }

   public BigDecimal getCodClt() {
        return codClt;
   }

   public void setCodClt(BigDecimal codClt) {
        this.codClt = codClt;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
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

   public BigDecimal getCodProjPai() {
        return codProjPai;
   }

   public void setCodProjPai(BigDecimal codProjPai) {
        this.codProjPai = codProjPai;
   }

   public BigDecimal getCodUsuResp() {
        return codUsuResp;
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        this.codUsuResp = codUsuResp;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        this.dtInicio = dtInicio;
   }

   public Timestamp getDtTermino() {
        return dtTermino;
   }

   public void setDtTermino(Timestamp dtTermino) {
        this.dtTermino = dtTermino;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public BigDecimal getHrFinalMax() {
        return hrFinalMax;
   }

   public void setHrFinalMax(BigDecimal hrFinalMax) {
        this.hrFinalMax = hrFinalMax;
   }

   public BigDecimal getHrInicialMin() {
        return hrInicialMin;
   }

   public void setHrInicialMin(BigDecimal hrInicialMin) {
        this.hrInicialMin = hrInicialMin;
   }

   public String getIdentificacao() {
        return identificacao;
   }

   public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
   }

   public BigDecimal getIntervaloMax() {
        return intervaloMax;
   }

   public void setIntervaloMax(BigDecimal intervaloMax) {
        this.intervaloMax = intervaloMax;
   }

   public BigDecimal getIntervaloMin() {
        return intervaloMin;
   }

   public void setIntervaloMin(BigDecimal intervaloMin) {
        this.intervaloMin = intervaloMin;
   }

   public BigDecimal getLimBonif() {
        return limBonif;
   }

   public void setLimBonif(BigDecimal limBonif) {
        this.limBonif = limBonif;
   }

   public BigDecimal getNuQue() {
        return nuQue;
   }

   public void setNuQue(BigDecimal nuQue) {
        this.nuQue = nuQue;
   }

   public BigDecimal getPercRetencao() {
        return percRetencao;
   }

   public void setPercRetencao(BigDecimal percRetencao) {
        this.percRetencao = percRetencao;
   }

   public String getRetencaoAtiva() {
        return retencaoAtiva;
   }

   public void setRetencaoAtiva(String retencaoAtiva) {
        this.retencaoAtiva = retencaoAtiva;
   }

   public BigDecimal getUltimoRdo() {
        return ultimoRdo;
   }

   public void setUltimoRdo(BigDecimal ultimoRdo) {
        this.ultimoRdo = ultimoRdo;
   }

   public String getTimContaCompart() {
        return timContaCompart;
   }

   public void setTimContaCompart(String timContaCompart) {
        this.timContaCompart = timContaCompart;
   }

   public BigDecimal getTimNmCtaComp() {
        return timNmCtaComp;
   }

   public void setTimNmCtaComp(BigDecimal timNmCtaComp) {
        this.timNmCtaComp = timNmCtaComp;
   }

   public BigDecimal getTimParcProj() {
        return timParcProj;
   }

   public void setTimParcProj(BigDecimal timParcProj) {
        this.timParcProj = timParcProj;
   }

   public BigDecimal getTimTxPart() {
        return timTxPart;
   }

   public void setTimTxPart(BigDecimal timTxPart) {
        this.timTxPart = timTxPart;
   }

   @Override
   public String getEntityName() {
        return "Projeto";
   }

   @Override
   public Projeto fromVO(DynamicVO vo) {
        this.abreviatura = vo.asString("ABREVIATURA");
        this.amostraCusMax = vo.asBigDecimal("AMOSTRACUSMAX");
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.cargaHorMax = vo.asBigDecimal("CARGAHORMAX");
        this.codClt = vo.asBigDecimal("CODCLT");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codCtaCtb2 = vo.asBigDecimal("CODCTACTB2");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codProjPai = vo.asBigDecimal("CODPROJPAI");
        this.codUsuResp = vo.asBigDecimal("CODUSURESP");
        this.dtInicio = vo.asTimestamp("DTINICIO");
        this.dtTermino = vo.asTimestamp("DTTERMINO");
        this.grau = vo.asBigDecimal("GRAU");
        this.hrFinalMax = vo.asBigDecimal("HRFINALMAX");
        this.hrInicialMin = vo.asBigDecimal("HRINICIALMIN");
        this.identificacao = vo.asString("IDENTIFICACAO");
        this.intervaloMax = vo.asBigDecimal("INTERVALOMAX");
        this.intervaloMin = vo.asBigDecimal("INTERVALOMIN");
        this.limBonif = vo.asBigDecimal("LIMBONIF");
        this.nuQue = vo.asBigDecimal("NUQUE");
        this.percRetencao = vo.asBigDecimal("PERCRETENCAO");
        this.retencaoAtiva = vo.asString("RETENCAOATIVA");
        this.ultimoRdo = vo.asBigDecimal("ULTIMORDO");
        this.timContaCompart = vo.asString("TIMCONTACOMPART");
        this.timNmCtaComp = vo.asBigDecimal("TIMNMCTACOMP");
        this.timParcProj = vo.asBigDecimal("TIMPARCPROJ");
        this.timTxPart = vo.asBigDecimal("TIMTXPART");
        return this;
   }
}
