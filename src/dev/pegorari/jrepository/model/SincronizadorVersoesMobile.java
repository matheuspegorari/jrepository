package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SincronizadorVersoesMobile extends AbstractSankhyaEntity<SincronizadorVersoesMobile> {
   public String getId() {
        return this.getVo().asString("ID");
   }

   public void setId(String id) {
        markAsChanged("ID", id);
   }

   public String getNomeInstancia() {
        return this.getVo().asString("NOMEINSTANCIA");
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   @Override
   public String getTableName() {
        return "TSLSVM";
   }

   @Override
   public String getEntityName() {
        return "SincronizadorVersoesMobile";
   }

   @Override
   public SincronizadorVersoesMobile fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
