package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegistroOperacaoEstoque extends AbstractSankhyaEntity<RegistroOperacaoEstoque> {
   private String statusExec;
   private BigDecimal nuNota;
   private BigDecimal ideFx;
   private BigDecimal seqOper;
   private BigDecimal seqRope;
   private BigDecimal codProdPa;
   private BigDecimal idIatv;
   private String controlePa;
   private BigDecimal qtdBase;
   private BigDecimal codUsu;
   private String tipoOper;
   private BigDecimal nuApo;

   public String getStatusExec() {
        return statusExec;
   }

   public void setStatusExec(String statusExec) {
        markAsChanged("STATUSEXEC", statusExec);
        this.statusExec = statusExec;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getSeqOper() {
        return seqOper;
   }

   public void setSeqOper(BigDecimal seqOper) {
        markAsChanged("SEQOPER", seqOper);
        this.seqOper = seqOper;
   }

   public BigDecimal getSeqRope() {
        return seqRope;
   }

   public void setSeqRope(BigDecimal seqRope) {
        markAsChanged("SEQROPE", seqRope);
        this.seqRope = seqRope;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getIdIatv() {
        return idIatv;
   }

   public void setIdIatv(BigDecimal idIatv) {
        markAsChanged("IDIATV", idIatv);
        this.idIatv = idIatv;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getQtdBase() {
        return qtdBase;
   }

   public void setQtdBase(BigDecimal qtdBase) {
        markAsChanged("QTDBASE", qtdBase);
        this.qtdBase = qtdBase;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getTipoOper() {
        return tipoOper;
   }

   public void setTipoOper(String tipoOper) {
        markAsChanged("TIPOOPER", tipoOper);
        this.tipoOper = tipoOper;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
        this.nuApo = nuApo;
   }

   @Override
   public String getTableName() {
        return "TPRROPE";
   }

   @Override
   public String getEntityName() {
        return "RegistroOperacaoEstoque";
   }

   @Override
   public RegistroOperacaoEstoque fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.statusExec = vo.asString("STATUSEXEC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.seqOper = vo.asBigDecimal("SEQOPER");
        this.seqRope = vo.asBigDecimal("SEQROPE");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.idIatv = vo.asBigDecimal("IDIATV");
        this.controlePa = vo.asString("CONTROLEPA");
        this.qtdBase = vo.asBigDecimal("QTDBASE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.tipoOper = vo.asString("TIPOOPER");
        this.nuApo = vo.asBigDecimal("NUAPO");
        return this;
   }
}
