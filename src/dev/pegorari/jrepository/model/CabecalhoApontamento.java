package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoApontamento extends AbstractSankhyaEntity<CabecalhoApontamento> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public BigDecimal getIdAtv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdAtv(BigDecimal idAtv) {
        markAsChanged("IDIATV", idAtv);
   }

   public Timestamp getDhApo() {
        return this.getVo().asTimestamp("DHAPO");
   }

   public void setDhApo(Timestamp dhApo) {
        markAsChanged("DHAPO", dhApo);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   @Override
   public String getTableName() {
        return "TPRAPO";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoApontamento";
   }

   @Override
   public CabecalhoApontamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
