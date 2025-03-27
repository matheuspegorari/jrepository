package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LiberacaoBloqueioContabil extends AbstractSankhyaEntity<LiberacaoBloqueioContabil> {
   public BigDecimal getCodUsuLib() {
        return this.getVo().asBigDecimal("CODUSULIB");
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
   }

   public BigDecimal getCodUsuSolicit() {
        return this.getVo().asBigDecimal("CODUSUSOLICIT");
   }

   public void setCodUsuSolicit(BigDecimal codUsuSolicit) {
        markAsChanged("CODUSUSOLICIT", codUsuSolicit);
   }

   public Timestamp getDhSolicit() {
        return this.getVo().asTimestamp("DHSOLICIT");
   }

   public void setDhSolicit(Timestamp dhSolicit) {
        markAsChanged("DHSOLICIT", dhSolicit);
   }

   public Timestamp getDtFinLib() {
        return this.getVo().asTimestamp("DTFINLIB");
   }

   public void setDtFinLib(Timestamp dtFinLib) {
        markAsChanged("DTFINLIB", dtFinLib);
   }

   public Timestamp getDtIniLib() {
        return this.getVo().asTimestamp("DTINILIB");
   }

   public void setDtIniLib(Timestamp dtIniLib) {
        markAsChanged("DTINILIB", dtIniLib);
   }

   public BigDecimal getNuBloqueio() {
        return this.getVo().asBigDecimal("NUBLOQUEIO");
   }

   public void setNuBloqueio(BigDecimal nuBloqueio) {
        markAsChanged("NUBLOQUEIO", nuBloqueio);
   }

   public BigDecimal getNuLiberacao() {
        return this.getVo().asBigDecimal("NULIBERACAO");
   }

   public void setNuLiberacao(BigDecimal nuLiberacao) {
        markAsChanged("NULIBERACAO", nuLiberacao);
   }

   public String getRotinaCtb() {
        return this.getVo().asString("ROTINACTB");
   }

   public void setRotinaCtb(String rotinaCtb) {
        markAsChanged("ROTINACTB", rotinaCtb);
   }

   public BigDecimal getSeqBloqueio() {
        return this.getVo().asBigDecimal("SEQBLOQUEIO");
   }

   public void setSeqBloqueio(BigDecimal seqBloqueio) {
        markAsChanged("SEQBLOQUEIO", seqBloqueio);
   }

   public String getStatusLib() {
        return this.getVo().asString("STATUSLIB");
   }

   public void setStatusLib(String statusLib) {
        markAsChanged("STATUSLIB", statusLib);
   }

   public String getTipoAcao() {
        return this.getVo().asString("TIPOACAO");
   }

   public void setTipoAcao(String tipoAcao) {
        markAsChanged("TIPOACAO", tipoAcao);
   }

   public String getTipoMov() {
        return this.getVo().asString("TIPOMOV");
   }

   public void setTipoMov(String tipoMov) {
        markAsChanged("TIPOMOV", tipoMov);
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
        return this;
   }
}
