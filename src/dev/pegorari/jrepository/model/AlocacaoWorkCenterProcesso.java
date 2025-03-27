package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AlocacaoWorkCenterProcesso extends AbstractSankhyaEntity<AlocacaoWorkCenterProcesso> {
   public BigDecimal getCodCwc() {
        return this.getVo().asBigDecimal("CODCWC");
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
   }

   public BigDecimal getIdAwc() {
        return this.getVo().asBigDecimal("IDAWC");
   }

   public void setIdAwc(BigDecimal idAwc) {
        markAsChanged("IDAWC", idAwc);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public String getTipAlocacao() {
        return this.getVo().asString("TIPALOCACAO");
   }

   public void setTipAlocacao(String tipAlocacao) {
        markAsChanged("TIPALOCACAO", tipAlocacao);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   @Override
   public String getTableName() {
        return "TPRAWC";
   }

   @Override
   public String getEntityName() {
        return "AlocacaoWorkCenterProcesso";
   }

   @Override
   public AlocacaoWorkCenterProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
