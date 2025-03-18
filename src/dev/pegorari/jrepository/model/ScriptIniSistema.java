package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class ScriptIniSistema extends AbstractSankhyaEntity<ScriptIniSistema> {
   private String nome;
   private String execucao;
   private Timestamp dtExecucao;

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public String getExecucao() {
        return execucao;
   }

   public void setExecucao(String execucao) {
        markAsChanged("EXECUCAO", execucao);
        this.execucao = execucao;
   }

   public Timestamp getDtExecucao() {
        return dtExecucao;
   }

   public void setDtExecucao(Timestamp dtExecucao) {
        markAsChanged("DTEXECUCAO", dtExecucao);
        this.dtExecucao = dtExecucao;
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
        this.setOriginalVO(vo);
        this.nome = vo.asString("NOME");
        this.execucao = vo.asString("EXECUCAO");
        this.dtExecucao = vo.asTimestamp("DTEXECUCAO");
        return this;
   }
}
