package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LiberacaoBloqueioContabil extends AbstractSankhyaEntity<LiberacaoBloqueioContabil> {
   private BigDecimal codUsuLib;
   private BigDecimal codUsuSolicit;
   private Timestamp dhSolicit;
   private Timestamp dtFinLib;
   private Timestamp dtIniLib;
   private BigDecimal nuBloqueio;
   private BigDecimal nuLiberacao;
   private String rotinaCtb;
   private BigDecimal seqBloqueio;
   private String statusLib;
   private String tipoAcao;
   private String tipoMov;

   public BigDecimal getCodUsuLib() {
        return codUsuLib;
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
        this.codUsuLib = codUsuLib;
   }

   public BigDecimal getCodUsuSolicit() {
        return codUsuSolicit;
   }

   public void setCodUsuSolicit(BigDecimal codUsuSolicit) {
        markAsChanged("CODUSUSOLICIT", codUsuSolicit);
        this.codUsuSolicit = codUsuSolicit;
   }

   public Timestamp getDhSolicit() {
        return dhSolicit;
   }

   public void setDhSolicit(Timestamp dhSolicit) {
        markAsChanged("DHSOLICIT", dhSolicit);
        this.dhSolicit = dhSolicit;
   }

   public Timestamp getDtFinLib() {
        return dtFinLib;
   }

   public void setDtFinLib(Timestamp dtFinLib) {
        markAsChanged("DTFINLIB", dtFinLib);
        this.dtFinLib = dtFinLib;
   }

   public Timestamp getDtIniLib() {
        return dtIniLib;
   }

   public void setDtIniLib(Timestamp dtIniLib) {
        markAsChanged("DTINILIB", dtIniLib);
        this.dtIniLib = dtIniLib;
   }

   public BigDecimal getNuBloqueio() {
        return nuBloqueio;
   }

   public void setNuBloqueio(BigDecimal nuBloqueio) {
        markAsChanged("NUBLOQUEIO", nuBloqueio);
        this.nuBloqueio = nuBloqueio;
   }

   public BigDecimal getNuLiberacao() {
        return nuLiberacao;
   }

   public void setNuLiberacao(BigDecimal nuLiberacao) {
        markAsChanged("NULIBERACAO", nuLiberacao);
        this.nuLiberacao = nuLiberacao;
   }

   public String getRotinaCtb() {
        return rotinaCtb;
   }

   public void setRotinaCtb(String rotinaCtb) {
        markAsChanged("ROTINACTB", rotinaCtb);
        this.rotinaCtb = rotinaCtb;
   }

   public BigDecimal getSeqBloqueio() {
        return seqBloqueio;
   }

   public void setSeqBloqueio(BigDecimal seqBloqueio) {
        markAsChanged("SEQBLOQUEIO", seqBloqueio);
        this.seqBloqueio = seqBloqueio;
   }

   public String getStatusLib() {
        return statusLib;
   }

   public void setStatusLib(String statusLib) {
        markAsChanged("STATUSLIB", statusLib);
        this.statusLib = statusLib;
   }

   public String getTipoAcao() {
        return tipoAcao;
   }

   public void setTipoAcao(String tipoAcao) {
        markAsChanged("TIPOACAO", tipoAcao);
        this.tipoAcao = tipoAcao;
   }

   public String getTipoMov() {
        return tipoMov;
   }

   public void setTipoMov(String tipoMov) {
        markAsChanged("TIPOMOV", tipoMov);
        this.tipoMov = tipoMov;
   }

   @Override
   public String getTableName() {
        return "TCBLBC";
   }

   @Override
   public String getEntityName() {
        return "LiberacaoBloqueioContabil";
   }

   @Override
   public LiberacaoBloqueioContabil fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codUsuLib = vo.asBigDecimal("CODUSULIB");
        this.codUsuSolicit = vo.asBigDecimal("CODUSUSOLICIT");
        this.dhSolicit = vo.asTimestamp("DHSOLICIT");
        this.dtFinLib = vo.asTimestamp("DTFINLIB");
        this.dtIniLib = vo.asTimestamp("DTINILIB");
        this.nuBloqueio = vo.asBigDecimal("NUBLOQUEIO");
        this.nuLiberacao = vo.asBigDecimal("NULIBERACAO");
        this.rotinaCtb = vo.asString("ROTINACTB");
        this.seqBloqueio = vo.asBigDecimal("SEQBLOQUEIO");
        this.statusLib = vo.asString("STATUSLIB");
        this.tipoAcao = vo.asString("TIPOACAO");
        this.tipoMov = vo.asString("TIPOMOV");
        return this;
   }
}
