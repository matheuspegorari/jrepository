package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class ScriptIniSistema extends AbstractSankhyaEntity<ScriptIniSistema> {
   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getExecucao() {
        return this.getVo().asString("EXECUCAO");
   }

   public void setExecucao(String execucao) {
        markAsChanged("EXECUCAO", execucao);
   }

   public Timestamp getDtExecucao() {
        return this.getVo().asTimestamp("DTEXECUCAO");
   }

   public void setDtExecucao(Timestamp dtExecucao) {
        markAsChanged("DTEXECUCAO", dtExecucao);
   }

   @Override
   public String getTableName() {
        return "TSISCI";
   }

   @Override
   public String getEntityName() {
        return "ScriptIniSistema";
   }

   @Override
   public ScriptIniSistema fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
