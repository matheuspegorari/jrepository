package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MetaGestaoIndicadores implements SankhyaEntity<MetaGestaoIndicadores> {

   private String apresDecGraf;
   private BigDecimal codInd;
   private BigDecimal codUng;
   private String descricao;
   private Timestamp dhProxAtual;
   private char[] expSqlPrevAcum;
   private char[] expSqlPrevPer;
   private char[] expSqlRealAcum;
   private char[] expSqlRealPer;
   private char[] expValPrevAcum;
   private char[] expValPrevPer;
   private char[] expValRealAcum;
   private char[] expValRealPer;
   private BigDecimal horarioAtu;
   private BigDecimal nuDsb;
   private BigDecimal nuMet;
   private BigDecimal nuMetPai;
   private BigDecimal periodicidade;
   private BigDecimal periodicidadeAtu;
   private String tipoAcumPrev;
   private String tipoRealAcum;
   private String tipPrev;
   private String dsPrevAcum;
   private String dsPrevPer;
   private String dsRealAcum;
   private String dsRealPer;
   private String infoPeriodo;
   private String tipoReal;
   private BigDecimal qtdPerLinear;
   private BigDecimal codInstQuebra;
   private String nomeInstaQuebra;

   public String getApresDecGraf() {
        return apresDecGraf;
   }

   public void setApresDecGraf(String apresDecGraf) {
        this.apresDecGraf = apresDecGraf;
   }

   public BigDecimal getCodInd() {
        return codInd;
   }

   public void setCodInd(BigDecimal codInd) {
        this.codInd = codInd;
   }

   public BigDecimal getCodUng() {
        return codUng;
   }

   public void setCodUng(BigDecimal codUng) {
        this.codUng = codUng;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDhProxAtual() {
        return dhProxAtual;
   }

   public void setDhProxAtual(Timestamp dhProxAtual) {
        this.dhProxAtual = dhProxAtual;
   }

   public char[] getExpSqlPrevAcum() {
        return expSqlPrevAcum;
   }

   public void setExpSqlPrevAcum(char[] expSqlPrevAcum) {
        this.expSqlPrevAcum = expSqlPrevAcum;
   }

   public char[] getExpSqlPrevPer() {
        return expSqlPrevPer;
   }

   public void setExpSqlPrevPer(char[] expSqlPrevPer) {
        this.expSqlPrevPer = expSqlPrevPer;
   }

   public char[] getExpSqlRealAcum() {
        return expSqlRealAcum;
   }

   public void setExpSqlRealAcum(char[] expSqlRealAcum) {
        this.expSqlRealAcum = expSqlRealAcum;
   }

   public char[] getExpSqlRealPer() {
        return expSqlRealPer;
   }

   public void setExpSqlRealPer(char[] expSqlRealPer) {
        this.expSqlRealPer = expSqlRealPer;
   }

   public char[] getExpValPrevAcum() {
        return expValPrevAcum;
   }

   public void setExpValPrevAcum(char[] expValPrevAcum) {
        this.expValPrevAcum = expValPrevAcum;
   }

   public char[] getExpValPrevPer() {
        return expValPrevPer;
   }

   public void setExpValPrevPer(char[] expValPrevPer) {
        this.expValPrevPer = expValPrevPer;
   }

   public char[] getExpValRealAcum() {
        return expValRealAcum;
   }

   public void setExpValRealAcum(char[] expValRealAcum) {
        this.expValRealAcum = expValRealAcum;
   }

   public char[] getExpValRealPer() {
        return expValRealPer;
   }

   public void setExpValRealPer(char[] expValRealPer) {
        this.expValRealPer = expValRealPer;
   }

   public BigDecimal getHorarioAtu() {
        return horarioAtu;
   }

   public void setHorarioAtu(BigDecimal horarioAtu) {
        this.horarioAtu = horarioAtu;
   }

   public BigDecimal getNuDsb() {
        return nuDsb;
   }

   public void setNuDsb(BigDecimal nuDsb) {
        this.nuDsb = nuDsb;
   }

   public BigDecimal getNuMet() {
        return nuMet;
   }

   public void setNuMet(BigDecimal nuMet) {
        this.nuMet = nuMet;
   }

   public BigDecimal getNuMetPai() {
        return nuMetPai;
   }

   public void setNuMetPai(BigDecimal nuMetPai) {
        this.nuMetPai = nuMetPai;
   }

   public BigDecimal getPeriodicidade() {
        return periodicidade;
   }

   public void setPeriodicidade(BigDecimal periodicidade) {
        this.periodicidade = periodicidade;
   }

   public BigDecimal getPeriodicidadeAtu() {
        return periodicidadeAtu;
   }

   public void setPeriodicidadeAtu(BigDecimal periodicidadeAtu) {
        this.periodicidadeAtu = periodicidadeAtu;
   }

   public String getTipoAcumPrev() {
        return tipoAcumPrev;
   }

   public void setTipoAcumPrev(String tipoAcumPrev) {
        this.tipoAcumPrev = tipoAcumPrev;
   }

   public String getTipoRealAcum() {
        return tipoRealAcum;
   }

   public void setTipoRealAcum(String tipoRealAcum) {
        this.tipoRealAcum = tipoRealAcum;
   }

   public String getTipPrev() {
        return tipPrev;
   }

   public void setTipPrev(String tipPrev) {
        this.tipPrev = tipPrev;
   }

   public String getDsPrevAcum() {
        return dsPrevAcum;
   }

   public void setDsPrevAcum(String dsPrevAcum) {
        this.dsPrevAcum = dsPrevAcum;
   }

   public String getDsPrevPer() {
        return dsPrevPer;
   }

   public void setDsPrevPer(String dsPrevPer) {
        this.dsPrevPer = dsPrevPer;
   }

   public String getDsRealAcum() {
        return dsRealAcum;
   }

   public void setDsRealAcum(String dsRealAcum) {
        this.dsRealAcum = dsRealAcum;
   }

   public String getDsRealPer() {
        return dsRealPer;
   }

   public void setDsRealPer(String dsRealPer) {
        this.dsRealPer = dsRealPer;
   }

   public String getInfoPeriodo() {
        return infoPeriodo;
   }

   public void setInfoPeriodo(String infoPeriodo) {
        this.infoPeriodo = infoPeriodo;
   }

   public String getTipoReal() {
        return tipoReal;
   }

   public void setTipoReal(String tipoReal) {
        this.tipoReal = tipoReal;
   }

   public BigDecimal getQtdPerLinear() {
        return qtdPerLinear;
   }

   public void setQtdPerLinear(BigDecimal qtdPerLinear) {
        this.qtdPerLinear = qtdPerLinear;
   }

   public BigDecimal getCodInstQuebra() {
        return codInstQuebra;
   }

   public void setCodInstQuebra(BigDecimal codInstQuebra) {
        this.codInstQuebra = codInstQuebra;
   }

   public String getNomeInstaQuebra() {
        return nomeInstaQuebra;
   }

   public void setNomeInstaQuebra(String nomeInstaQuebra) {
        this.nomeInstaQuebra = nomeInstaQuebra;
   }

   @Override
   public String getEntityName() {
        return "MetaGestaoIndicadores";
   }

   @Override
   public MetaGestaoIndicadores fromVO(DynamicVO vo) {
        this.apresDecGraf = vo.asString("APRESDECGRAF");
        this.codInd = vo.asBigDecimal("CODIND");
        this.codUng = vo.asBigDecimal("CODUNG");
        this.descricao = vo.asString("DESCRICAO");
        this.dhProxAtual = vo.asTimestamp("DHPROXATUAL");
        this.expSqlPrevAcum = vo.asClob("EXPSQLPREVACUM");
        this.expSqlPrevPer = vo.asClob("EXPSQLPREVPER");
        this.expSqlRealAcum = vo.asClob("EXPSQLREALACUM");
        this.expSqlRealPer = vo.asClob("EXPSQLREALPER");
        this.expValPrevAcum = vo.asClob("EXPVALPREVACUM");
        this.expValPrevPer = vo.asClob("EXPVALPREVPER");
        this.expValRealAcum = vo.asClob("EXPVALREALACUM");
        this.expValRealPer = vo.asClob("EXPVALREALPER");
        this.horarioAtu = vo.asBigDecimal("HORARIOATU");
        this.nuDsb = vo.asBigDecimal("NUDSB");
        this.nuMet = vo.asBigDecimal("NUMET");
        this.nuMetPai = vo.asBigDecimal("NUMETPAI");
        this.periodicidade = vo.asBigDecimal("PERIODICIDADE");
        this.periodicidadeAtu = vo.asBigDecimal("PERIODICIDADEATU");
        this.tipoAcumPrev = vo.asString("TIPOACUMPREV");
        this.tipoRealAcum = vo.asString("TIPOREALACUM");
        this.tipPrev = vo.asString("TIPPREV");
        this.dsPrevAcum = vo.asString("DSPREVACUM");
        this.dsPrevPer = vo.asString("DSPREVPER");
        this.dsRealAcum = vo.asString("DSREALACUM");
        this.dsRealPer = vo.asString("DSREALPER");
        this.infoPeriodo = vo.asString("INFOPERIODO");
        this.tipoReal = vo.asString("TIPOREAL");
        this.qtdPerLinear = vo.asBigDecimal("QTDPERLINEAR");
        this.codInstQuebra = vo.asBigDecimal("CODINSTQUEBRA");
        this.nomeInstaQuebra = vo.asString("NOMEINSTAQUEBRA");
        return this;
   }
}
