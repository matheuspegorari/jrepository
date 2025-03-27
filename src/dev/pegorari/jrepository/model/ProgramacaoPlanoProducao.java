package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProgramacaoPlanoProducao extends AbstractSankhyaEntity<ProgramacaoPlanoProducao> {
   public Timestamp getDhIniPrev() {
        return this.getVo().asTimestamp("DHINIPREV");
   }

   public void setDhIniPrev(Timestamp dhIniPrev) {
        markAsChanged("DHINIPREV", dhIniPrev);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public BigDecimal getIdEfx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdEfx(BigDecimal idEfx) {
        markAsChanged("IDEFX", idEfx);
   }

   public Timestamp getDhFinPrev() {
        return this.getVo().asTimestamp("DHFINPREV");
   }

   public void setDhFinPrev(Timestamp dhFinPrev) {
        markAsChanged("DHFINPREV", dhFinPrev);
   }

   public BigDecimal getCodCwc() {
        return this.getVo().asBigDecimal("CODCWC");
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public BigDecimal getIdAwc() {
        return this.getVo().asBigDecimal("IDAWC");
   }

   public void setIdAwc(BigDecimal idAwc) {
        markAsChanged("IDAWC", idAwc);
   }

   public char[] getJsonProg() {
        return this.getVo().asClob("JSONPROG");
   }

   public void setJsonProg(char[] jsonProg) {
        markAsChanged("JSONPROG", jsonProg);
   }

   @Override
   public String getTableName() {
        return "TPRPIPROC";
   }

   @Override
   public String getEntityName() {
        return "ProgramacaoPlanoProducao";
   }

   @Override
   public ProgramacaoPlanoProducao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
