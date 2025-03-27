package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MotivosParada extends AbstractSankhyaEntity<MotivosParada> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodMtp() {
        return this.getVo().asBigDecimal("CODMTP");
   }

   public void setCodMtp(BigDecimal codMtp) {
        markAsChanged("CODMTP", codMtp);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getMotivoParada() {
        return this.getVo().asString("MOTIVOPARADA");
   }

   public void setMotivoParada(String motivoParada) {
        markAsChanged("MOTIVOPARADA", motivoParada);
   }

   public String getPlanejada() {
        return this.getVo().asString("PLANEJADA");
   }

   public void setPlanejada(String planejada) {
        markAsChanged("PLANEJADA", planejada);
   }

   @Override
   public String getTableName() {
        return "TPRMTP";
   }

   @Override
   public String getEntityName() {
        return "MotivosParada";
   }

   @Override
   public MotivosParada fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
