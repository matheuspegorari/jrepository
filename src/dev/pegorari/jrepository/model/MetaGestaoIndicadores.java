package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MetaGestaoIndicadores extends AbstractSankhyaEntity<MetaGestaoIndicadores> {
   public String getApresdecGraf() {
        return this.getVo().asString("APRESDECGRAF");
   }

   public void setApresdecGraf(String apresdecGraf) {
        markAsChanged("APRESDECGRAF", apresdecGraf);
   }

   public BigDecimal getCodInd() {
        return this.getVo().asBigDecimal("CODIND");
   }

   public void setCodInd(BigDecimal codInd) {
        markAsChanged("CODIND", codInd);
   }

   public BigDecimal getCodUng() {
        return this.getVo().asBigDecimal("CODUNG");
   }

   public void setCodUng(BigDecimal codUng) {
        markAsChanged("CODUNG", codUng);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhProxAtual() {
        return this.getVo().asTimestamp("DHPROXATUAL");
   }

   public void setDhProxAtual(Timestamp dhProxAtual) {
        markAsChanged("DHPROXATUAL", dhProxAtual);
   }

   public char[] getExpSqlPrevAcum() {
        return this.getVo().asClob("EXPSQLPREVACUM");
   }

   public void setExpSqlPrevAcum(char[] expSqlPrevAcum) {
        markAsChanged("EXPSQLPREVACUM", expSqlPrevAcum);
   }

   public char[] getExpSqlPrevPer() {
        return this.getVo().asClob("EXPSQLPREVPER");
   }

   public void setExpSqlPrevPer(char[] expSqlPrevPer) {
        markAsChanged("EXPSQLPREVPER", expSqlPrevPer);
   }

   public char[] getExpSqlRealAcum() {
        return this.getVo().asClob("EXPSQLREALACUM");
   }

   public void setExpSqlRealAcum(char[] expSqlRealAcum) {
        markAsChanged("EXPSQLREALACUM", expSqlRealAcum);
   }

   public char[] getExpSqlRealPer() {
        return this.getVo().asClob("EXPSQLREALPER");
   }

   public void setExpSqlRealPer(char[] expSqlRealPer) {
        markAsChanged("EXPSQLREALPER", expSqlRealPer);
   }

   public char[] getExpValPrevAcum() {
        return this.getVo().asClob("EXPVALPREVACUM");
   }

   public void setExpValPrevAcum(char[] expValPrevAcum) {
        markAsChanged("EXPVALPREVACUM", expValPrevAcum);
   }

   public char[] getExpValPrevPer() {
        return this.getVo().asClob("EXPVALPREVPER");
   }

   public void setExpValPrevPer(char[] expValPrevPer) {
        markAsChanged("EXPVALPREVPER", expValPrevPer);
   }

   public char[] getExpValRealAcum() {
        return this.getVo().asClob("EXPVALREALACUM");
   }

   public void setExpValRealAcum(char[] expValRealAcum) {
        markAsChanged("EXPVALREALACUM", expValRealAcum);
   }

   public char[] getExpValRealPer() {
        return this.getVo().asClob("EXPVALREALPER");
   }

   public void setExpValRealPer(char[] expValRealPer) {
        markAsChanged("EXPVALREALPER", expValRealPer);
   }

   public BigDecimal getHorarioAtu() {
        return this.getVo().asBigDecimal("HORARIOATU");
   }

   public void setHorarioAtu(BigDecimal horarioAtu) {
        markAsChanged("HORARIOATU", horarioAtu);
   }

   public BigDecimal getNuDsb() {
        return this.getVo().asBigDecimal("NUDSB");
   }

   public void setNuDsb(BigDecimal nuDsb) {
        markAsChanged("NUDSB", nuDsb);
   }

   public BigDecimal getNuMet() {
        return this.getVo().asBigDecimal("NUMET");
   }

   public void setNuMet(BigDecimal nuMet) {
        markAsChanged("NUMET", nuMet);
   }

   public BigDecimal getNuMetPai() {
        return this.getVo().asBigDecimal("NUMETPAI");
   }

   public void setNuMetPai(BigDecimal nuMetPai) {
        markAsChanged("NUMETPAI", nuMetPai);
   }

   public BigDecimal getPeriodicidade() {
        return this.getVo().asBigDecimal("PERIODICIDADE");
   }

   public void setPeriodicidade(BigDecimal periodicidade) {
        markAsChanged("PERIODICIDADE", periodicidade);
   }

   public BigDecimal getPeriodicidadeAtu() {
        return this.getVo().asBigDecimal("PERIODICIDADEATU");
   }

   public void setPeriodicidadeAtu(BigDecimal periodicidadeAtu) {
        markAsChanged("PERIODICIDADEATU", periodicidadeAtu);
   }

   public String getTipoAcumPrev() {
        return this.getVo().asString("TIPOACUMPREV");
   }

   public void setTipoAcumPrev(String tipoAcumPrev) {
        markAsChanged("TIPOACUMPREV", tipoAcumPrev);
   }

   public String getTipoRealAcum() {
        return this.getVo().asString("TIPOREALACUM");
   }

   public void setTipoRealAcum(String tipoRealAcum) {
        markAsChanged("TIPOREALACUM", tipoRealAcum);
   }

   public String getTipPrev() {
        return this.getVo().asString("TIPPREV");
   }

   public void setTipPrev(String tipPrev) {
        markAsChanged("TIPPREV", tipPrev);
   }

   public String getDsPrevAcum() {
        return this.getVo().asString("DSPREVACUM");
   }

   public void setDsPrevAcum(String dsPrevAcum) {
        markAsChanged("DSPREVACUM", dsPrevAcum);
   }

   public String getDsPrevPer() {
        return this.getVo().asString("DSPREVPER");
   }

   public void setDsPrevPer(String dsPrevPer) {
        markAsChanged("DSPREVPER", dsPrevPer);
   }

   public String getDsRealAcum() {
        return this.getVo().asString("DSREALACUM");
   }

   public void setDsRealAcum(String dsRealAcum) {
        markAsChanged("DSREALACUM", dsRealAcum);
   }

   public String getDsRealPer() {
        return this.getVo().asString("DSREALPER");
   }

   public void setDsRealPer(String dsRealPer) {
        markAsChanged("DSREALPER", dsRealPer);
   }

   public String getInfoPeriodo() {
        return this.getVo().asString("INFOPERIODO");
   }

   public void setInfoPeriodo(String infoPeriodo) {
        markAsChanged("INFOPERIODO", infoPeriodo);
   }

   public String getTipoReal() {
        return this.getVo().asString("TIPOREAL");
   }

   public void setTipoReal(String tipoReal) {
        markAsChanged("TIPOREAL", tipoReal);
   }

   public BigDecimal getQtdPerLinear() {
        return this.getVo().asBigDecimal("QTDPERLINEAR");
   }

   public void setQtdPerLinear(BigDecimal qtdPerLinear) {
        markAsChanged("QTDPERLINEAR", qtdPerLinear);
   }

   public BigDecimal getCodInstQuebra() {
        return this.getVo().asBigDecimal("CODINSTQUEBRA");
   }

   public void setCodInstQuebra(BigDecimal codInstQuebra) {
        markAsChanged("CODINSTQUEBRA", codInstQuebra);
   }

   public String getNomeInstaQuebra() {
        return this.getVo().asString("NOMEINSTAQUEBRA");
   }

   public void setNomeInstaQuebra(String nomeInstaQuebra) {
        markAsChanged("NOMEINSTAQUEBRA", nomeInstaQuebra);
   }

   @Override
   public String getTableName() {
        return "TMIMET";
   }

   @Override
   public String getEntityName() {
        return "MetaGestaoIndicadores";
   }

   @Override
   public MetaGestaoIndicadores fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
