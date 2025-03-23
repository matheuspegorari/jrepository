package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SincronizadorVersoesMobile extends AbstractSankhyaEntity<SincronizadorVersoesMobile> {
   private String id;
   private String nomeInstancia;
   private BigDecimal versao;

   public String getId() {
        return id;
   }

   public void setId(String id) {
        markAsChanged("ID", id);
        this.id = id;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
        this.nomeInstancia = nomeInstancia;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
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
        this.id = vo.asString("ID");
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.versao = vo.asBigDecimal("VERSAO");
        return this;
   }
}
