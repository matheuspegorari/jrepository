package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegistroOperacaoEstoque extends AbstractSankhyaEntity<RegistroOperacaoEstoque> {
   public String getStatusExec() {
        return this.getVo().asString("STATUSEXEC");
   }

   public void setStatusExec(String statusExec) {
        markAsChanged("STATUSEXEC", statusExec);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getSeqOper() {
        return this.getVo().asBigDecimal("SEQOPER");
   }

   public void setSeqOper(BigDecimal seqOper) {
        markAsChanged("SEQOPER", seqOper);
   }

   public BigDecimal getSeqRope() {
        return this.getVo().asBigDecimal("SEQROPE");
   }

   public void setSeqRope(BigDecimal seqRope) {
        markAsChanged("SEQROPE", seqRope);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getIdIatv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdIatv(BigDecimal idIatv) {
        markAsChanged("IDIATV", idIatv);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getQtdBase() {
        return this.getVo().asBigDecimal("QTDBASE");
   }

   public void setQtdBase(BigDecimal qtdBase) {
        markAsChanged("QTDBASE", qtdBase);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getTipoOper() {
        return this.getVo().asString("TIPOOPER");
   }

   public void setTipoOper(String tipoOper) {
        markAsChanged("TIPOOPER", tipoOper);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
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
        this.setVo(vo);
        return this;
   }
}
