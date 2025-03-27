package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MotivosPerda extends AbstractSankhyaEntity<MotivosPerda> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodMpe() {
        return this.getVo().asBigDecimal("CODMPE");
   }

   public void setCodMpe(BigDecimal codMpe) {
        markAsChanged("CODMPE", codMpe);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getMotivoPerda() {
        return this.getVo().asString("MOTIVOPERDA");
   }

   public void setMotivoPerda(String motivoPerda) {
        markAsChanged("MOTIVOPERDA", motivoPerda);
   }

   @Override
   public String getTableName() {
        return "TPRMPE";
   }

   @Override
   public String getEntityName() {
        return "MotivosPerda";
   }

   @Override
   public MotivosPerda fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
