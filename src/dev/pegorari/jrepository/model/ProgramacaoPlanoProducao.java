package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProgramacaoPlanoProducao extends AbstractSankhyaEntity<ProgramacaoPlanoProducao> {
   private Timestamp dhIniPrev;
   private BigDecimal idIproc;
   private BigDecimal idEfx;
   private Timestamp dhFinPrev;
   private BigDecimal codCwc;
   private BigDecimal codWcp;
   private BigDecimal idAwc;
   private char[] jsonProg;

   public Timestamp getDhIniPrev() {
        return dhIniPrev;
   }

   public void setDhIniPrev(Timestamp dhIniPrev) {
        markAsChanged("DHINIPREV", dhIniPrev);
        this.dhIniPrev = dhIniPrev;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
        this.idIproc = idIproc;
   }

   public BigDecimal getIdEfx() {
        return idEfx;
   }

   public void setIdEfx(BigDecimal idEfx) {
        markAsChanged("IDEFX", idEfx);
        this.idEfx = idEfx;
   }

   public Timestamp getDhFinPrev() {
        return dhFinPrev;
   }

   public void setDhFinPrev(Timestamp dhFinPrev) {
        markAsChanged("DHFINPREV", dhFinPrev);
        this.dhFinPrev = dhFinPrev;
   }

   public BigDecimal getCodCwc() {
        return codCwc;
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
        this.codCwc = codCwc;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public BigDecimal getIdAwc() {
        return idAwc;
   }

   public void setIdAwc(BigDecimal idAwc) {
        markAsChanged("IDAWC", idAwc);
        this.idAwc = idAwc;
   }

   public char[] getJsonProg() {
        return jsonProg;
   }

   public void setJsonProg(char[] jsonProg) {
        markAsChanged("JSONPROG", jsonProg);
        this.jsonProg = jsonProg;
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
        this.dhIniPrev = vo.asTimestamp("DHINIPREV");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.idEfx = vo.asBigDecimal("IDEFX");
        this.dhFinPrev = vo.asTimestamp("DHFINPREV");
        this.codCwc = vo.asBigDecimal("CODCWC");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.idAwc = vo.asBigDecimal("IDAWC");
        this.jsonProg = vo.asClob("JSONPROG");
        return this;
   }
}
