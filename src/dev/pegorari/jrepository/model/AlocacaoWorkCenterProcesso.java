package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AlocacaoWorkCenterProcesso extends AbstractSankhyaEntity<AlocacaoWorkCenterProcesso> {
   private BigDecimal codCwc;
   private BigDecimal idAwc;
   private BigDecimal idProc;
   private String tipAlocacao;
   private String descricao;
   private BigDecimal codWcp;

   public BigDecimal getCodCwc() {
        return codCwc;
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
        this.codCwc = codCwc;
   }

   public BigDecimal getIdAwc() {
        return idAwc;
   }

   public void setIdAwc(BigDecimal idAwc) {
        markAsChanged("IDAWC", idAwc);
        this.idAwc = idAwc;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public String getTipAlocacao() {
        return tipAlocacao;
   }

   public void setTipAlocacao(String tipAlocacao) {
        markAsChanged("TIPALOCACAO", tipAlocacao);
        this.tipAlocacao = tipAlocacao;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
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
        this.codCwc = vo.asBigDecimal("CODCWC");
        this.idAwc = vo.asBigDecimal("IDAWC");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.tipAlocacao = vo.asString("TIPALOCACAO");
        this.descricao = vo.asString("DESCRICAO");
        this.codWcp = vo.asBigDecimal("CODWCP");
        return this;
   }
}
